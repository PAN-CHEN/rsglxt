package scu.controller.RSBDGL.LeaveandDissmiss;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 */
public class Leave implements LeaveandDismiss {

    Record lzbd=new Record(){
        public void AddintoDB(){
//            写入员工信息表
        }
    };
    @RequestMapping("/leave")
    public void SearchFromDB(){
//        查询离职员工信息
    }
    public void UpdatetoLeader(){

    }
}
