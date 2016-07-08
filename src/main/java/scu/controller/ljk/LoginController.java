package scu.controller.ljk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scu.model.Emplinfo;
import scu.model.Loginfo;
import scu.model.Userfactor;
import scu.repository.EmplinfoRepository;
import scu.repository.LoginfoRepository;
import scu.repository.UserfactorRepository;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginfoRepository loginfoRepository;
    @Autowired
    private UserfactorRepository userfactorRepository;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpSession session,  Model model, @RequestParam("emplno") String s_emplno, @RequestParam("password") String password){
        int emplno = Integer.parseInt(s_emplno);

        Loginfo loginfo = loginfoRepository.findOne(emplno);

        if(loginfo != null && loginfo.getPassword().equals(password)){ //登陆成功
            Userfactor userfactor = userfactorRepository.findOne(emplno);

            session.setAttribute("login", true);
            session.setAttribute("emplno", emplno);
            session.setAttribute("factor", userfactor.getUserfactor());

            return "personel-management";
        }
        //账号密码错误
        return "index";
    }
}
