package scu.controller.GZGLXT;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by DAi on 16/7/8.
 */
@Controller
@RequestMapping("/payroll-management-subsystem")
public class gzglxt_index {
    @RequestMapping(method = GET)
    public String index(Model model, HttpSession session) {
        String factor = (String) session.getAttribute("factor");
        model.addAttribute("factor", factor);
        return "payroll-management-subsystem";
    }

}
