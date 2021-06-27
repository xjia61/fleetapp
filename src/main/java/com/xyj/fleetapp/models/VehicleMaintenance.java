package com.xyj.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class VehicleMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @ManyToOne
    @JoinColumn(name = "vehicleid",insertable = false,updatable = false)
    private Vehicle vehicle;
    private Integer vehicleid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data endDate;

    @ManyToOne
    @JoinColumn(name = "supplierid",insertable = false,updatable = false)
    private Supplier supplier;
    private Integer supplierid;

    private Double price;
    private String remarks;

}
