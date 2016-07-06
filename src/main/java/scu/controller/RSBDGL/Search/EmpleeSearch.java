package scu.controller.RSBDGL.Search;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 */
public class EmpleeSearch implements Search{
    @RequestMapping("/emplicreate")
    public void SearchFromDB(){
//        查询人员基本信息表
//        新增员工确认
    }

    Record rybd=new Record() {
        @Override
        public void AddintoDB() {
//            写入人员信息基本表
        }
    };

    public void UpdatetoLeader(){

    }

}
