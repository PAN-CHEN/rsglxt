package scu.controller.RSBDGL.Search;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Emplinfo;

import java.util.List;


/**
 * Created by Criss Li on 2016/7/7.
 */
public interface EmplinfoRepository extends JpaRepository <Emplinfo,Integer> {
    List<Emplinfo> findAll(Specification<Emplinfo> spec);
}
