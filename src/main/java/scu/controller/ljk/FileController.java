package scu.controller.ljk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijiankuan on 16/7/7.
 */
@Controller
public class FileController {
    @RequestMapping("file/{id}")
    public String file(){
        //返回档案信息
        return "";
    }
}
