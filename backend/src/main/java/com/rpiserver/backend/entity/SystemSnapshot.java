package com.rpiserver.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="system_snapshots")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class SystemSnapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;

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
    private Double diskUsedPercentage;

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

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}
