package scu.controller.GZGLXT;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by DAi on 16/7/8.
 */
@Controller
@RequestMapping("/set_account")
public class AddFileController {
    //建账功能
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String set_account(Model model, HttpSession session) {
        if (session.getAttribute("factor") == "领导" || session.getAttribute("factor") == "人事部") {
            return "set_account";
        }
        model.addAttribute("");
        return null;
    }
}
