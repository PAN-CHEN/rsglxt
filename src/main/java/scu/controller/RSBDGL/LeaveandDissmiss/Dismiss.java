package scu.controller.RSBDGL.LeaveandDissmiss;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 */
public class Dismiss implements LeaveandDismiss {

    Record ctbd=new Record() {
        @Override
        public void AddintoDB() {
//          写入人事信息表
        }
    };
    @RequestMapping("/dismiss")
    public void SearchFromDB(){
//        搜索人员基本信息表
    }

    public void UpdatetoLeader(){
//        报告老板
    }
}
