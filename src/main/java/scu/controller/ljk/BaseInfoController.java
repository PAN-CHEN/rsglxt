package scu.controller.ljk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import scu.repository.LoginfoRepository;

import scu.model.Loginfo;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class BaseInfoController {

    @Autowired
    private LoginfoRepository loginfoRepository;

    @RequestMapping("/baseinfo")
    public String base(Model model){
        //返回基础人事信息

        Loginfo loginfo = loginfoRepository.findOne(1);
        model.addAttribute("loginfo", loginfo);

        return "baseinfo";
    }
}
