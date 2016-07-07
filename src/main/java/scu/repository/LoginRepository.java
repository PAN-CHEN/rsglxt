package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Loginfo;

/**
 * Created by DAi on 16/7/7.
 */
public interface LoginRepository extends JpaRepository<Loginfo, Long>{
}
