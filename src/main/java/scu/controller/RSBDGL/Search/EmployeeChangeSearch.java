package scu.controller.RSBDGL.Search;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 * 修改员工身份信息
 */
public class EmployeeChangeSearch implements Search {
    @RequestMapping("/empliinfochange")
    public void SearchFromDB(){
//        身份修改确认

    }
    public void UpdatetoLeader(){

    }

    Record rybd=new Record() {
        @Override
        public void AddintoDB() {
            String sqlofempchange="UPDATE EMPLINFO SET ";
//            写入人员信息基本表
        }
    };

}
