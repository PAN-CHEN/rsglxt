package scu.controller.GZGLXT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scu.model.Allowance;
import scu.model.Department;
import scu.model.Salary;
import scu.repository.AllowanceRepository;
import scu.repository.DepartRepository;
import scu.repository.SalaryRepository;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



/**
 * Created by DAi on 16/7/8.
 */

@Controller
@RequestMapping("/salary")
public class SalaryController {


    @Autowired private SalaryRepository salaryRepository;
    @Autowired private AllowanceRepository allowanceRepository;
    @Autowired private DepartRepository departRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String salary_query_get(Model model, HttpSession session) {

        List<Department> departments = departRepository.findAll();
        String factor = (String) session.getAttribute("factor");
        System.out.print(factor);
        int emplno = (int)session.getAttribute("emplno");

        model.addAttribute("factor", factor);
        model.addAttribute("factor", "职员");
        model.addAttribute("emplno", emplno);
        model.addAttribute("department", departments);
        return "salary_inquiry";
    }

    @RequestMapping(value = "/query_s", method = RequestMethod.POST)
    public String salary_querys_post(Model model, HttpSession session,
                                     @RequestParam(value = "month", required = true) String date1,
                                     @RequestParam(value = "emplno", required = false) String s_emplno) throws ParseException {

        model.addAttribute("ok_s", "yes");

        int emplno=1;

        //修改日期格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dt=dateFormat.parse(date1);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH,-5);//日期减5个月
        Date dt1= rightNow.getTime();
        String factor = (String) session.getAttribute("factor");
        model.addAttribute("factor", factor);
        System.out.print(factor);
        //逻辑是不是有问题
        if (!factor.equals("职员")){
            //人事部门会计部门查询
            emplno = Integer.parseInt(s_emplno);
            System.out.print(factor);
        }else {//员工查询
            emplno = (int)session.getAttribute("emplno");
            model.addAttribute("emplno", emplno);
        }
        List<Salary> salaries = salaryRepository.findByEmplnoAndDateBetween(emplno, dt1, dt);
        List<Allowance> allowances = allowanceRepository.findByEmplnoAndDateBetween(emplno, dt1, dt);
        model.addAttribute("salaries", salaries);
        model.addAttribute("allowances", allowances);
        return "salary_inquiry";
    }

    @RequestMapping(value = "query_m", method =RequestMethod.POST)
    public String salary_querym_post(Model model, HttpSession session,
                                     @RequestParam(value = "month", required = true) String date1,
                                     @RequestParam(value = "type", required = true) String type,
                                     @RequestParam(value = "dep", required = false) String depart) throws ParseException {
        model.addAttribute("ok_m", "yes");

        int emplno;

        //时间获取与处理
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dt=dateFormat.parse(date1);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH,-5);//日期减5个月
        Date dt1= rightNow.getTime();

        String factor = (String) session.getAttribute("factor");
        model.addAttribute("type", type);

        if (factor.equals("职员")){
            emplno = (int)session.getAttribute("emplno");
            model.addAttribute("emplno", emplno);
            List<Salary> salary_m = salaryRepository.findByEmplnoAndDateBetween(emplno, dt1, dt);
            System.out.print("1");
            model.addAttribute("salary_m", salary_m);
        }else if (!factor.equals("职员")){//职员查询
            model.addAttribute("factor", factor);
            List<Salary> salary_m = this.jdbcTemplate.query("select * from Emplinfo e, Department d, Salary s where d.departname = ? and e.depno = d.departno and e.emplno = s.emplno and s.date BETWEEN ? and ?",(rs, rowNum)->new Salary(rs.getInt("emplno"),rs.getDate("date"),rs.getDouble("total"),rs.getDouble("cmoney"),rs.getDouble("dmoney"),rs.getDouble("tmoney")),depart, dt1, dt);
            model.addAttribute("salary_m", salary_m);
        }

        return "salary_inquiry";
    }

}
