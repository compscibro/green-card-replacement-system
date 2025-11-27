package edu.gmu.i90.repository;

import edu.gmu.i90.model.ApplicationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRecordRepository extends JpaRepository<ApplicationRecord, Integer> {

    // Needed for the Approve Portal
    List<ApplicationRecord> findByStatus(String status);
}
