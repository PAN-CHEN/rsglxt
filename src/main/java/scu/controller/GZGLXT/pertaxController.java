package scu.controller.GZGLXT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DAi on 16/7/8.
 */
@Controller
@RequestMapping(value = "/pertax")
public class PertaxController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        //查询个人所得税
        return null;
    }
}
