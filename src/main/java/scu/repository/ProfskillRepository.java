package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Profskill;

import java.util.List;

/**
 * Created by lijiankuan on 16/7/9.
 */
public interface ProfskillRepository extends JpaRepository<Profskill, Integer> {
    List<Profskill> findBySkillno(String skillno);
}
