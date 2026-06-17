package com.rpiserver.backend.service;

import com.rpiserver.backend.dto.SystemSnapshotResponse;
import com.rpiserver.backend.entity.SystemSnapshot;
import com.rpiserver.backend.repository.SystemSnapshotRepository;
import com.rpiserver.backend.dto.SystemSnapshotRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SystemSnapshotService {
    private final SystemSnapshotRepository repository;

    public SystemSnapshotResponse save(
            SystemSnapshotRequest request) {

        SystemSnapshot snapshot =
                mapToEntity(request);

        SystemSnapshot saved =
                repository.save(snapshot);

        return mapToResponse(saved);
    }

    public SystemSnapshotResponse getLatest() {
        return repository.findTopByOrderByCreatedAtDesc().map(this::mapToResponse).orElse(null);
    }

    public List<SystemSnapshotResponse> getAll() {
        return repository.findAll().stream().map(this::mapToResponse).toList();
    }

    private SystemSnapshot mapToEntity(SystemSnapshotRequest request) {

        return SystemSnapshot.builder()
                .cpuUsage(request.getCpuUsage())
                .cpuCores(request.getCpuCores())
                .cpuCurrentMHz(request.getCpuCurrentMHz())

                .cpuLoad1Min(request.getCpuLoad1Min())
                .cpuLoad5Min(request.getCpuLoad5Min())
                .cpuLoad15Min(request.getCpuLoad15Min())

                .memoryUsedMb(request.getMemoryUsedMb())
                .memoryFreeMb(request.getMemoryFreeMb())
                .memoryTotalMb(request.getMemoryTotalMb())

                .diskUsedMb(request.getDiskUsedMb())
                .diskFreeMb(request.getDiskFreeMb())
                .diskTotalMb(request.getDiskTotalMb())
                .diskUsedPercentage(request.getDiskUsedPercentage())

                .temperature(request.getTemperature())

                .networkRxKb(request.getNetworkRxKb())
                .networkTxKb(request.getNetworkTxKb())

                .healthScore(request.getHealthScore())
                .healthStatus(request.getHealthStatus())

                .undervoltage(request.getUndervoltage())
                .throttled(request.getThrottled())
                .frequencyCapped(request.getFrequencyCapped())

                .serviceStatus(request.getServiceStatus())
                .serviceUptime(request.getServiceUptime())

                .systemUptime(request.getSystemUptime())
                .processCount(request.getProcessCount())
                .build();
    }

    private SystemSnapshotResponse mapToResponse(
            SystemSnapshot snapshot) {

        return SystemSnapshotResponse.builder()
                .id(snapshot.getId())
                .createdAt(snapshot.getCreatedAt())

                .cpuUsage(snapshot.getCpuUsage())
                .cpuCores(snapshot.getCpuCores())
                .cpuCurrentMHz(snapshot.getCpuCurrentMHz())

                .cpuLoad1Min(snapshot.getCpuLoad1Min())
                .cpuLoad5Min(snapshot.getCpuLoad5Min())
                .cpuLoad15Min(snapshot.getCpuLoad15Min())

                .memoryUsedMb(snapshot.getMemoryUsedMb())
                .memoryFreeMb(snapshot.getMemoryFreeMb())
                .memoryTotalMb(snapshot.getMemoryTotalMb())

                .diskUsedMb(snapshot.getDiskUsedMb())
                .diskFreeMb(snapshot.getDiskFreeMb())
                .diskTotalMb(snapshot.getDiskTotalMb())
                .diskUsedPercentage(snapshot.getDiskUsedPercentage())

                .temperature(snapshot.getTemperature())

                .networkRxKb(snapshot.getNetworkRxKb())
                .networkTxKb(snapshot.getNetworkTxKb())

                .healthScore(snapshot.getHealthScore())
                .healthStatus(snapshot.getHealthStatus())

                .undervoltage(snapshot.getUndervoltage())
                .throttled(snapshot.getThrottled())
                .frequencyCapped(snapshot.getFrequencyCapped())

                .serviceStatus(snapshot.getServiceStatus())
                .serviceUptime(snapshot.getServiceUptime())

                .systemUptime(snapshot.getSystemUptime())
                .processCount(snapshot.getProcessCount())
                .build();
    }
}
