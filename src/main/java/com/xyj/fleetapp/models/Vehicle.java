package com.xyj.fleetapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "wehicleid",insertable = false,updatable = false)
    private VehicleType vehicleType;
    private Integer vehicleid;

    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data registrationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "vehiclemakeid",insertable = false,updatable = false)
    private VehicleMake vehicleMake;
    private Integer vehiclemakeid;

    private String power;
    private String fuelCapacity;
    @ManyToOne
    @JoinColumn(name = "vehiclestatusid",insertable = false,updatable = false)
    private VehicleStatus vehicleStatus;
    private Integer vehiclestatusid;

    private String netWeight;

}
