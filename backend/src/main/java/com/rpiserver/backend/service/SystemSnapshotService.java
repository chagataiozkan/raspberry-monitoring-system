package com.rpiserver.backend.service;

import com.rpiserver.backend.entity.SystemSnapshot;
import com.rpiserver.backend.repository.SystemSnapshotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SystemSnapshotService {
    private final SystemSnapshotRepository repository;

    public SystemSnapshot save(SystemSnapshot snapshot) {
        return repository.save(snapshot);
    }

    public SystemSnapshot getLatest() {
        return repository.findTopByOrderByCreatedAtDesc().orElse(null);
    }

    public List<SystemSnapshot> getAll() {
        return repository.findAll();
    }
}
