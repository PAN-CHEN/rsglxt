package scu.controller.ljk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class SkillController {
    @RequestMapping(value = "skill/{id}", method = RequestMethod.GET)
    public String getSkill(){
        //返回技能列表
        return "";
    }

    @RequestMapping(value = "skill/{id}", method = RequestMethod.POST)
    public String setSkill(){
        //返回修改技能列 表页面
        return "";
    }
}
