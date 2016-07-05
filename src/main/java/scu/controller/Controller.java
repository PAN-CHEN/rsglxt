package scu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lijiankuan on 16/7/5.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello world";
    }
}
