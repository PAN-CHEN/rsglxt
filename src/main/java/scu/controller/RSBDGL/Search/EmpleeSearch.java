package scu.controller.RSBDGL.Search;

import org.springframework.web.bind.annotation.RequestMapping;
import scu.controller.RSBDGL.Record;

/**
 * Created by Criss Li on 2016/7/6.
 * 添加、删除员工
 */
public class EmpleeSearch implements Search{
    @RequestMapping("/emplicreate")
    public  void CreatenewEmployee(){
        /*添加新的员工*/
    }

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
