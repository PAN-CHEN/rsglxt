package scu.controller.RSBDGL.Search;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Position;

import java.util.List;

/**
 * Created by Criss Li on 2016/7/7.
 */
public interface PositionRepository extends JpaRepository<Position,String> {
    List<Position> findAll(Specification<Position> spec);
}
