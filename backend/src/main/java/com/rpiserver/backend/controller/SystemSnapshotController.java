package com.rpiserver.backend.controller;

import com.rpiserver.backend.dto.SystemSnapshotRequest;
import com.rpiserver.backend.dto.SystemSnapshotResponse;
import com.rpiserver.backend.service.SystemSnapshotService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
@RequiredArgsConstructor
public class SystemSnapshotController {
    private final SystemSnapshotService service;

    @PostMapping
    public SystemSnapshotResponse save(
            @Valid
            @RequestBody
            SystemSnapshotRequest request) {

        return service.save(request);
    }

    @GetMapping("/latest")
    public SystemSnapshotResponse getLatest() {
        return service.getLatest();
    }

    @GetMapping
    public List<SystemSnapshotResponse> getAll() {
        return service.getAll();
    }
}
