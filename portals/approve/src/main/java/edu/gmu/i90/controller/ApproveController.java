package edu.gmu.i90.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.gmu.i90.model.ApplicationRecord;
import edu.gmu.i90.service.ApproveService;

@RestController
@RequestMapping("/approve")
@CrossOrigin(origins = "*")
public class ApproveController {

    private final ApproveService approveService;

    public ApproveController(ApproveService approveService) {
        this.approveService = approveService;
    }

    // Test endpoint
    @GetMapping("/test")
    public String test() {
        return "ApproveController is running";
    }

    // 1. Get applications by status (REVIEWED / APPROVED / REJECTED)
    @GetMapping("/list")
    public List<ApplicationRecord> list(
            @RequestParam(name = "status", defaultValue = "REVIEWED") String status) {
        return approveService.getApplicationsByStatus(status);
    }

    // 2. Get one application by ID
    @GetMapping("/{id}")
    public ApplicationRecord getById(@PathVariable Integer id) {
        return approveService.getById(id);
    }

    // 3. Approve an application
    @PostMapping("/{id}/approve")
    public ApplicationRecord approve(
            @PathVariable Integer id,
            @RequestParam String notes,
            @RequestParam String approvedBy
    ) {
        return approveService.approve(id, notes, approvedBy);
    }

    // 4. Reject an application
    @PostMapping("/{id}/reject")
    public ApplicationRecord reject(
            @PathVariable Integer id,
            @RequestParam String notes,
            @RequestParam String approvedBy
    ) {
        return approveService.reject(id, notes, approvedBy);
    }
}
