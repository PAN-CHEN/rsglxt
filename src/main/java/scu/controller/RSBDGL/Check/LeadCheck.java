package scu.controller.RSBDGL.Check;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 */
public class LeadCheck implements Check {
    @RequestMapping("/Leadercontrol")
    public void comfirmed(){

    }
    Record shjl=new Record() {
        @Override
        public void AddintoDB() {

        }
    };
}
