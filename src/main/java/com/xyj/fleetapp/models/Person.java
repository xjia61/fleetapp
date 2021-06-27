package com.xyj.fleetapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String othername;
    private String title;
    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name = "countryid", insertable = false,updatable = false)
    private Country country;
    private State state;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data dateOfBirth;
    private String city;
    private String address;
    private String phone;
    private String mobile;
    private String email;
    private String photo;

}
