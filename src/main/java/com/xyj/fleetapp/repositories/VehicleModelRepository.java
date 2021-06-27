package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
