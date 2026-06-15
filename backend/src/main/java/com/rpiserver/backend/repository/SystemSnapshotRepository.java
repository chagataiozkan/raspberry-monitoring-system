package com.rpiserver.backend.repository;

import com.rpiserver.backend.entity.SystemSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SystemSnapshotRepository extends JpaRepository<SystemSnapshot, Long> {
    Optional<SystemSnapshot> findTopByOrderByCreatedAtDesc();
}
