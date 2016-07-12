package scu.controller.RSBDGL.Search;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import scu.controller.RSBDGL.Record;
import scu.model.Emplinfo;
import scu.repository.EmplinfoRepository;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Criss Li on 2016/7/6.
 * 添加、删除员工
 */
@Controller
public class EmpleeSearch implements Search{
    @Autowired
    private EmplinfoRepository emplinfoRepository;

    @RequestMapping(value="/empcreate",method = RequestMethod.GET)
    public void CreatenewEmployee(HttpServletRequest request) {
        /*添加新的员工*/

        Emplinfo emplinfo=new Emplinfo();
        emplinfo.setName(request.getParameter("name"));
        emplinfo.setEdu(request.getParameter("edu"));
        emplinfo.setAddr(request.getParameter("addr"));
        emplinfo.setDepno(request.getParameter("depno"));
        emplinfo.setId(request.getParameter("id"));
        emplinfo.setPostno(request.getParameter("titleno"));
        emplinfo.setTel(request.getParameter("tel"));
        emplinfo.setFileno(request.getParameter("fileno"));
        emplinfo.setNewaddch("1");
        emplinfo.setIdchangech("0");
        emplinfo.setLeavech("0");
        emplinfo.setDiscontch("0");
        emplinfoRepository.save(emplinfo);

    }
    @RequestMapping(value="/empsearch",method = RequestMethod.GET)
    public void SearchFromDB(HttpServletRequest request){
//        查询人员基本信息表
//        新增员工确认
//        emplinfoRepository.findAll(new Specification<Emplinfo>() {
//            @Override
//            public Predicate toPredicate(Root<Emplinfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                Path<String> namePath=root.get("name");
//                Path<String> EduPath=root.get("edu");
//                Path<String> AddrPath=root.get("addr");
//                Path<String> DepnoPath=root.get("depno");
//                Path<String> IdPath=root.get("id");
//                Path<String> PostnoPath=root.get("postno");
//                Path<String> TitlenoPath=root.get("titleno");
//                Path<String> TelPath=root.get("tel");
//                Path<String> FilenoPath=root.get("fileno");
//                Path<String> NewaddchPath=root.get("newaddch");
//                criteriaQuery.where(criteriaBuilder.like(namePath,"%"+request.getParameter("name")+"%"),criteriaBuilder.like(EduPath,"%"+request.getParameter("edu")+"%"),criteriaBuilder.like(AddrPath,"%"+request.getParameter("addr")+"%"),criteriaBuilder.like(DepnoPath,"%"+request.getParameter("depno")+"%"),criteriaBuilder.like(IdPath,"%"+request.getParameter("id")+"%"),criteriaBuilder.like(PostnoPath,"%"+request.getParameter("postno")+"%"),criteriaBuilder.like(TitlenoPath,"%"+request.getParameter("titleno")+"%"),criteriaBuilder.like(TelPath,"%"+request.getParameter("tel")+"%"),criteriaBuilder.like(FilenoPath,"%"+request.getParameter("fileno")+"%"),criteriaBuilder.like(NewaddchPath,"1"));
//                return null;
//            }
//        });
    }

}
