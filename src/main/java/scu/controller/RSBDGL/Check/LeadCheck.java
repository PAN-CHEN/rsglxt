package scu.controller.RSBDGL.Check;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 */
public class LeadCheck implements Check {
    @RequestMapping("/Leadercontrol/{id}")
    public void employeecomfirmed(){

    }
    public void titlecomfirmed(){

    }
    public void positioncomfirmed(){

    }
    public void employeechangecomfirmed(){

    }
    Record shjl=new Record() {
        @Override
        public void AddintoDB() {
            String sqlofemployeecomfirm="UPDATE EMPLINFO SET NEWADDCH=FALSE";//员工入职、辞退确认
            String sqloftitle="UPDATE TITLE SET CHANGE='0'";//新增、删除职称确认
            String sqlofposition="UPDATE POSITION SET CHANGE='0'";//新增、删除职务确认
            String sqlofempchgcomfirm="UPDATE EMPLINFO SET IDCHANGECH";//修改员工身份信息确认
            String sqlofleave="UPDATE EMPLINFO SET LEAVECH=FALSE";
        }
    };
}
