package scu.controller.ljk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class SubsystemController {
    @RequestMapping("personel-management")
    public String personel(){
        return "personel-management";
    }

    @RequestMapping("/payroll-management-subsystem")
    public String payroll(HttpSession session, Model model){    //返回工资子系统页面
        String factor = (String)session.getAttribute("factor");     //为模版增加factor值
        model.addAttribute("factor", factor);


        return "payroll-management-subsystem";
    }

    @RequestMapping("/personel-management-subsystem")
    public String personel(HttpSession session, Model model){   //返回人事管理子系统页面
        String factor = (String)session.getAttribute("factor");     //为模版增加factor值
        model.addAttribute("factor", factor);

        return "personel-management-subsystem";
    }
}
