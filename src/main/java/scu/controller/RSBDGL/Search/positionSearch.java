package scu.controller.RSBDGL.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import scu.model.Position;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Criss Li on 2016/7/6.
 * 新增、删除职务
 */
@Controller
public class positionSearch implements Search {
    @Autowired
    private  PositionRepository positionRepository;
    @RequestMapping(value="/changeposition",method = RequestMethod.GET)
    public void Createnewposition(HttpServletRequest request){
//        新建职务表
//        职务修改确认置1
        Position position=new Position();
        position.setPosino(request.getParameter("posino"));
        position.setPosiname(request.getParameter("posiname"));
        positionRepository.save(position);
    }
    @RequestMapping(value = "/searchposition",method=RequestMethod.GET)
    public void SearchFromDB(HttpServletRequest request){
//        查询职务表
        positionRepository.findAll(new Specification<Position>() {
            @Override
            public Predicate toPredicate(Root<Position> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<String> PosinoPath=root.get("posino");
                Path<String> PosinonamePath=root.get("posinoname");

                criteriaQuery.where(criteriaBuilder.like(PosinoPath,"%"+request.getParameter("posino")+"%"),criteriaBuilder.like(PosinonamePath,"%"+request.getParameter("posinoname")+"%"));
                return null;
            }
        });
    }
}
