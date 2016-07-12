package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Allowance;

import java.util.Date;
import java.util.List;

/**
 * Created by DAi on 16/7/9.
 */
public interface AllowanceRepository extends JpaRepository<Allowance, Long> {

    List<Allowance> findByEmplnoAndDateBetween(int Emplno, Date date1, Date date2);
}
