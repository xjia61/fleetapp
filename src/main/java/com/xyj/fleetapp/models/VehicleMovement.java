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
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Vehicle vehicle;
    private int vehicleid;

    @ManyToOne
    @JoinColumn(name = "locationid1",insertable = false,updatable = false)
    private Location location1;
    private int locationid1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data date1;

    @ManyToOne
    @JoinColumn(name = "locationid2",insertable = false,updatable = false)
    private Location location2;
    private int locationid2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data date2;

    private String remarks;
}
