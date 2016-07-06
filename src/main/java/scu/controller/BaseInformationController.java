package scu.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijiankuan on 16/7/6.
 */

public class BaseInformationController {
    @RequestMapping("/BaseInformationController/{id}")
    public String baseInformation(){
        return "baseInformation";
    }
}
