package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Salary;

import java.util.Date;
import java.util.List;

/**
 * Created by DAi on 16/7/8.
 */
public interface SalaryRepository extends JpaRepository<Salary, Long> {

    List<Salary> findByEmplnoAndDateBetween(int Emplno, Date date1, Date date2);
}
