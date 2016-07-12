package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Emplinfo;
import scu.model.Tempaward;

import java.util.List;

/**
 * Created by DAi on 16/7/8.
 */
public interface TempawardRepository extends JpaRepository<Tempaward, Long> {
    List<Tempaward> findByawardno(String awardname);
}
