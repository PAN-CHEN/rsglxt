package scu.controller.RSBDGL.Search;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 * 新增、删除职务
 */
public class positionSearch implements Search {
    @RequestMapping("/changeposition")
    public void Createnewposition(){
//        新建职务表
//        职务修改确认置1
    }
    public void SearchFromDB(){
//        查询职务表

    }
    public void UpdatetoLeader(){

    }
    Record rybd=new Record() {
        @Override
        public void AddintoDB() {
//            写入人员信息基本表
            String sqlofnewposition="INSERT INTO POSITION WHERE ";
        }
    };

}
