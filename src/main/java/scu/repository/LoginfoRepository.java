package scu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scu.model.Loginfo;

/**
 * Created by lijiankuan on 16/7/7.
 */
public interface LoginfoRepository extends JpaRepository<Loginfo, Integer> {
}
