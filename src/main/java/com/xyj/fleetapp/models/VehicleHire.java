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
public class VehicleHire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicleid",insertable = false,updatable = false)
    private Vehicle vehicle;
    private Integer vehicleid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data dateOut;
    private String timeOut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data dateIn;
    private String timeIn;
    @ManyToOne
    @JoinColumn(name="cilentid",insertable = false,updatable = false)
    private Client client;
    private Integer cilentid;

    @ManyToOne
    @JoinColumn(name="licationid",insertable = false,updatable = false)
    private Location location;
    private Integer locationid;

    private String price;
    private String remarks;


}
