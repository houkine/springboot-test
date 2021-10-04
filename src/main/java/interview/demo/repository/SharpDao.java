package interview.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import interview.demo.entity.*;

@Repository
public interface SharpDao extends JpaRepository<Sharp, Long>, JpaSpecificationExecutor<Sharp>{
    
}
