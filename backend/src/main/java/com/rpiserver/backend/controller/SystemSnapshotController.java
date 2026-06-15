package com.rpiserver.backend.controller;

import com.rpiserver.backend.entity.SystemSnapshot;
import com.rpiserver.backend.service.SystemSnapshotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
@RequiredArgsConstructor
public class SystemSnapshotController {
    private final SystemSnapshotService service;

    @PostMapping
    public SystemSnapshot save(@RequestBody SystemSnapshot snapshot) {
        return service.save(snapshot);
    }

    @GetMapping("/latest")
    public SystemSnapshot getLatest() {
        return service.getLatest();
    }

    @GetMapping
    public List<SystemSnapshot> getAll() {
        return service.getAll();
    }
}
