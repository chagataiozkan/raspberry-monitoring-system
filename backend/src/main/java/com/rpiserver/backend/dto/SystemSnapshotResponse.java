package com.rpiserver.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemSnapshotResponse {

    private Long id;
    private LocalDateTime createdAt;

    private Double cpuUsage;
    private Integer cpuCores;
    private Integer cpuCurrentMHz;

    private Double cpuLoad1Min;
    private Double cpuLoad5Min;
    private Double cpuLoad15Min;

    private Double memoryUsedMb;
    private Double memoryFreeMb;
    private Double memoryTotalMb;

    private Double diskUsedMb;
    private Double diskFreeMb;
    private Double diskTotalMb;
    private Double diskUsedPercentage;

    private Double temperature;

    private Double networkRxKb;
    private Double networkTxKb;

    private Double healthScore;
    private String healthStatus;

    private Boolean undervoltage;
    private Boolean throttled;
    private Boolean frequencyCapped;

    private String serviceStatus;
    private String serviceUptime;

    private String systemUptime;
    private Integer processCount;
}