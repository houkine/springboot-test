package interview.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import interview.demo.entity.*;

@Repository
public interface SharpDao extends JpaRepository<Sharp, Long>, JpaSpecificationExecutor<Sharp>{
    // List findGroupByName();
    Page<Sharp> findAll(Pageable pageable);
}
