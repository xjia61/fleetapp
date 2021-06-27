package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
