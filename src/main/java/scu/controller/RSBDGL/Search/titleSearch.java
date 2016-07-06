package scu.controller.RSBDGL.Search;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 * 新增、删除职称
 */
public class titleSearch implements Search{
    @RequestMapping("/changetitle")
    public void Createneetitle(){
//        新增职称
//        职称修改确认定1
    }
    public void SearchFromDB(){
//        查询职称表
//        职称修改确认
    }
    public void UpdatetoLeader(){

    }
    Record rybd=new Record() {
        @Override
        public void AddintoDB() {
//            写入人员信息基本表
            String sqlofnewtitle="INSERT INTO TITLE WHERE ";
        }
    };
}
