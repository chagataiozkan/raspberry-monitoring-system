package com.rpiserver.backend.dto;

import lombok.Data;

@Data
public class SystemSnapshotRequest {

    //CPU
    private Double cpuUsage;
    private Integer cpuCores;
    private Integer cpuCurrentMHz;

    private Double cpuLoad1Min;
    private Double cpuLoad5Min;
    private Double cpuLoad15Min;

    //Memory
    private Double memoryUsedMb;
    private Double memoryFreeMb;
    private Double memoryTotalMb;

    //Disk
    private Double diskUsedMb;
    private Double diskFreeMb;
    private Double diskTotalMb;
    private Double diskUsagePercentage;

    //Temperature
    private Double temperature;

    //Network
    private Double networkRxKb;
    private Double networkTxKb;

    //Health
    private Double healthScore;
    private String healthStatus;

    //Throttling
    private Boolean undervoltage;
    private Boolean throttled;
    private Boolean frequencyCapped;

    //Service
    private String serviceStatus;
    private String serviceUptime;

    //System
    private String systemUptime;
    private Integer processCount;
}
