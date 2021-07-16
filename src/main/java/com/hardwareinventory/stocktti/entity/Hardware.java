package com.hardwareinventory.stocktti.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hardwareinventory.stocktti.enums.DeviceStatusCondition;
import com.hardwareinventory.stocktti.enums.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnore
    private Client client;

    @Column(nullable = false)
    private String deviceLocalization;

    @Column(nullable = false)
    private String deviceOwnerUserName;

    @Column(nullable = false)
    private String deviceTag;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeviceType deviceType;

    @Column(nullable = false)
    private String deviceBrand;

    @Column(nullable = false)
    private String deviceModel;

    @Column(nullable = false)
    private String deviceSO;

    @Column(nullable = false)
    private boolean deviceSOLicensed;

    @Column(nullable = false)
    private boolean deviceOfficeLicensed;

    @Column(nullable = false)
    private boolean deviceAntivirusLicensed;

    @Column(nullable = false)
    private String deviceProcessor;

    @Column(nullable = false)
    private String deviceProcessorGeneration;

    @Column(nullable = false)
    private String deviceProcessorGHZ;

    @Column(nullable = false)
    private String deviceRAM;

    @Column(nullable = false)
    private String deviceHD;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeviceStatusCondition deviceStatusCondition;

    @Column(nullable = false)
    private String deviceSwapPrediction;

}
