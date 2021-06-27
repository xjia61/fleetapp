package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
