package scu.controller.RSBDGL.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;
import scu.model.Emplinfo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Criss Li on 2016/7/6.
 * 修改员工身份信息
 */
@Controller
public class EmployeeChangeSearch implements Search {
    @Autowired
    private EmplinfoRepository emplinfoRepository;
    @RequestMapping("/empliinfochange")
    public void SearchFromDB(HttpServletRequest request){
//        身份修改确认
        Emplinfo emplinfo=new Emplinfo();
        if(request.getParameter("name")!="%")
            emplinfo.setName(request.getParameter("name"));
        if(request.getParameter("edu")!="%")
            emplinfo.setEdu(request.getParameter("edu"));
        if(request.getParameter("addr")!="%")
            emplinfo.setAddr(request.getParameter("addr"));
        if(request.getParameter("id")!="%")
            emplinfo.setId(request.getParameter("id"));
        if(request.getParameter("titleno")!="%")
            emplinfo.setTitleno(request.getParameter("titleno"));
        if(request.getParameter("tel")!="%")
            emplinfo.setTel(request.getParameter("tel"));
        if(request.getParameter("fileno")!="%")
            emplinfo.setFileno(request.getParameter("fileno"));
        emplinfo.setIdchangech("1");
        emplinfoRepository.save(emplinfo);
    }
    public void UpdatetoLeader(){

    }

}
