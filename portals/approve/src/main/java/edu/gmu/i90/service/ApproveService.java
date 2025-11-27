package edu.gmu.i90.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.gmu.i90.model.ApplicationRecord;
import edu.gmu.i90.repository.ApplicationRecordRepository;

@Service
public class ApproveService {

    private final ApplicationRecordRepository repository;

    public ApproveService(ApplicationRecordRepository repository) {
        this.repository = repository;
    }

    // Get applications for a given status (REVIEWED, APPROVED, REJECTED)
    public List<ApplicationRecord> getApplicationsByStatus(String status) {
        return repository.findByStatus(status);
    }

    // Keep this for backwards-compatibility if you want
    public List<ApplicationRecord> getPendingApplications() {
        return getApplicationsByStatus("REVIEWED");
    }

    // 2. Get one application by ID
    public ApplicationRecord getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // 3. Approve an application
    public ApplicationRecord approve(Integer id, String notes, String approvedBy) {
        ApplicationRecord record = getById(id);
        if (record == null) return null;

        record.setStatus("APPROVED");
        record.setApprovalNotes(notes);
        record.setApprovedBy(approvedBy);
        record.setApprovalTimestamp(LocalDateTime.now());

        return repository.save(record);
    }

    // 4. Reject an application
    public ApplicationRecord reject(Integer id, String notes, String approvedBy) {
        ApplicationRecord record = getById(id);
        if (record == null) return null;

        record.setStatus("REJECTED");
        record.setApprovalNotes(notes);
        record.setApprovedBy(approvedBy);
        record.setApprovalTimestamp(LocalDateTime.now());

        return repository.save(record);
    }
}
