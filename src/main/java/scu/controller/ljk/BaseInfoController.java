package scu.controller.ljk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import scu.model.Emplinfo;
import scu.model.Emplprofskill;
import scu.model.Profskill;
import scu.repository.EmplinfoRepository;
import scu.repository.EmplprofskillRepository;
import scu.repository.LoginfoRepository;

import scu.model.Loginfo;
import scu.repository.ProfskillRepository;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class BaseInfoController {

    @Autowired
    private EmplinfoRepository emplinfoRepository;


    @RequestMapping("/baseinfo")
    public String base(HttpSession session, Model model){
        //返回基础人事信息

        int emplno = (Integer) session.getAttribute("emplno");
        Emplinfo emplinfo = emplinfoRepository.findOne(emplno);


        model.addAttribute("emplinfo", emplinfo);

        return "baseinfo";
    }
}
