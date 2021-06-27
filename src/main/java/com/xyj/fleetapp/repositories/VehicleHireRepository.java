package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleHireRepository extends JpaRepository<VehicleHire,Integer> {
}
