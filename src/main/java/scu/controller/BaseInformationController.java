package scu.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by lijiankuan on 16/7/6.
 */

public class BaseInformationController {
    @RequestMapping("/BaseInformationController/{id}")
    public String baseInformation(HttpSession session){
        Long id = (Long)session.getAttribute("id");

        return "baseInformation";
    }
}
