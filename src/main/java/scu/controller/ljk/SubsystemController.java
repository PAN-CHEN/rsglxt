package scu.controller.ljk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class SubsystemController {
    @RequestMapping("/payroll-management-subsystem")
    public String payroll(){
        return "payroll-management-subsystem";
    }

    @RequestMapping("/personel-management-subsystem")
    public String personel(){
        return "personel-management-subsystem";
    }
}
