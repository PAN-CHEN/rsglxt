package scu.controller.RSBDGL.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import scu.model.Title;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Criss Li on 2016/7/6.
 * 新增、删除职称
 */
@Controller
public class titleSearch implements Search{
    @Autowired
    TitleRepository titleRepository;
    @RequestMapping(value="/changetitle",method = RequestMethod.GET)
    public void Createneetitle(HttpServletRequest request){
//        新增职称
//        职称修改确认定
        Title title=new Title();
        title.setTitleno(request.getParameter("titleno"));
        title.setTitlename(request.getParameter("titlename"));
        titleRepository.save(title);
    }
    @RequestMapping(value="/searchtitle",method = RequestMethod.GET)
    public void SearchFromDB(HttpServletRequest request){
//        查询职称表
//        职称修改确认
        titleRepository.findAll(new Specification<Title>() {
            @Override
            public Predicate toPredicate(Root<Title> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<String> titlenoPath=root.get("titleno");
                Path<String> titlenamePath=root.get("titlename");
                criteriaQuery.where(criteriaBuilder.like(titlenoPath,"%"+request.getParameter("titleno")+"%"),criteriaBuilder.like(titlenamePath,"%"+request.getParameter("titlename")+"%"));
                return null;
            }
        });
    }
}
