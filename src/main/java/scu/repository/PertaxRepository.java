package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Pertax;

import java.util.Date;
import java.util.List;

/**
 * Created by DAi on 16/7/10.
 */
public interface PertaxRepository extends JpaRepository<Pertax, Long> {
    List<Pertax> findByEmplnoAndDateBetween(int Emplno, Date date1, Date date2);
}
