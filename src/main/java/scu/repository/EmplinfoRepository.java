package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Emplinfo;

import java.util.List;

/**
 * Created by lijiankuan on 16/7/7.
 */
public interface EmplinfoRepository extends JpaRepository<Emplinfo, Integer> {
    List<Emplinfo> findByEmplno(int emplno);
}
