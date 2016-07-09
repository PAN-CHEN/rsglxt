package scu.controller.ljk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import scu.model.Emplinfo;
import scu.model.Emplprofskill;
import scu.model.Profskill;
import scu.repository.EmplinfoRepository;
import scu.repository.EmplprofskillRepository;
import scu.repository.ProfskillRepository;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class SkillController {

    @Autowired
    private EmplinfoRepository emplinfoRepository;
    @Autowired
    private EmplprofskillRepository emplprofskillRepository;
    @Autowired
    private ProfskillRepository profskillRepository;

    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(value = "skills", method = RequestMethod.GET)
    public String getSkill(HttpSession session, Model model){
        //返回技能列表
        int emplno = (Integer) session.getAttribute("emplno");

        List<Emplprofskill> emplprofskills = emplprofskillRepository.findAll();

        ArrayList<Profskill> profskills = new ArrayList<>();

        for (Emplprofskill e: emplprofskills){
            profskills.add(profskillRepository.findBySkillno(e.getSkillno()).get(0));
        }

        model.addAttribute("skills", profskills);

        logger.info("next = {}", profskills.get(0).getSkillname());

        return "skills";

    }

}
