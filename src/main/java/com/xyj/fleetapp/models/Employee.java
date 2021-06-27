package com.xyj.fleetapp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name="employeeid",insertable = false,updatable = false)
    private EmployeeType employeeType;
    private Integer employeetypeid;
    private String photo;
    private String username;
    @ManyToOne
    @JoinColumn(name = "jobtitleid", insertable = false,updatable = false)
    private JobTitle jobTitle;
    private Integer jobtitleid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data hireDate;


}
