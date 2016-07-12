package scu.controller.RSBDGL.Search;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Title;

import java.util.List;

/**
 * Created by Criss Li on 2016/7/7.
 */
public interface TitleRepository extends JpaRepository<Title,String> {
    List<Title> findAll(Specification<Title> spec);

}
