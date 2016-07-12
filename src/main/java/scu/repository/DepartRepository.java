package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Department;

/**
 * Created by DAi on 16/7/10.
 */
public interface DepartRepository extends JpaRepository<Department, Long> {
}
