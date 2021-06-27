package com.xyj.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Data invoiceDate;

    @ManyToOne
    @JoinColumn()
    private InvoiceStatusType invoiceStatusType;
    private Integer invoicestatusid;

    @ManyToOne
    @JoinColumn(name = "clientid",insertable = false,updatable = false)
    private Client client;
    private  Integer clientid;
    private String remarks;

}
