package scu.controller.ljk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.util.Optional;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginfoRepository loginfoRepository;
    @Autowired
    private UserfactorRepository userfactorRepository;

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String loginGet(@RequestParam("next") Optional<String> next){
        return "login";
    }



    @RequestMapping(value = "", method = RequestMethod.POST)
    public String loginPost(HttpSession session,  Model model, @RequestParam("emplno") String s_emplno, @RequestParam("password") String password, @RequestParam("next") Optional<String> next){
        int emplno;
        try{emplno = Integer.parseInt(s_emplno);}
        catch (Exception e){
            //返回页面
            return "index";
        }


        Loginfo loginfo = loginfoRepository.findOne(emplno);

        if(loginfo != null && loginfo.getPassword().equals(password)){ //登陆成功
            Userfactor userfactor = userfactorRepository.findOne(emplno);

            session.setAttribute("login", true);
            session.setAttribute("emplno", emplno);
            session.setAttribute("factor", userfactor.getUserfactor());

            model.addAttribute("factor", userfactor.getUserfactor());

            logger.info("next = {}", next.orElse("personel-management"));

            return "redirect:".concat(next.orElse("personel-management"));
        }
        //账号密码错误
        return "index";
    }
}
