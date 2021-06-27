package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMakeRepository extends JpaRepository<VehicleMake,Integer> {
}
