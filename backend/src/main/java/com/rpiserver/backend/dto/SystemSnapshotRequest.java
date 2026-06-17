package com.rpiserver.backend.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemSnapshotRequest {

    @NotNull
    @PositiveOrZero
    private Double cpuUsage;

    @NotNull
    @Positive
    private Integer cpuCores;

    @PositiveOrZero
    private Integer cpuCurrentMHz;

    @PositiveOrZero
    private Double cpuLoad1Min;

    @PositiveOrZero
    private Double cpuLoad5Min;

    @PositiveOrZero
    private Double cpuLoad15Min;

    @PositiveOrZero
    private Double memoryUsedMb;

    @PositiveOrZero
    private Double memoryFreeMb;

    @PositiveOrZero
    private Double memoryTotalMb;

    @PositiveOrZero
    private Double diskUsedMb;

    @PositiveOrZero
    private Double diskFreeMb;

    @PositiveOrZero
    private Double diskTotalMb;

    @PositiveOrZero
    private Double diskUsedPercentage;

    @PositiveOrZero
    private Double temperature;

    @PositiveOrZero
    private Double networkRxKb;

    @PositiveOrZero
    private Double networkTxKb;

    @PositiveOrZero
    private Double healthScore;

    private String healthStatus;

    private Boolean undervoltage;
    private Boolean throttled;
    private Boolean frequencyCapped;

    private String serviceStatus;
    private String serviceUptime;

    private String systemUptime;

    @PositiveOrZero
    private Integer processCount;
}
