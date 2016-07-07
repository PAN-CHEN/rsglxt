package scu.controller.GZFLXT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import scu.model.Emplinfo;
import scu.repository.EmplInfoRepository;

/**
 * Created by DAi on 16/7/7.
 */

@Controller
@RequestMapping("/test")
public class test {
    @Autowired
    private EmplInfoRepository emplInfoRepository;

    @RequestMapping(value = "/hey", method = RequestMethod.GET)
    public String test(Model model){

        emplInfoRepository.findAll();
        Emplinfo emplinfo = emplInfoRepository.findOne(2);
        model.addAttribute("emplinfo", emplinfo);
        return "test";
    }
}
