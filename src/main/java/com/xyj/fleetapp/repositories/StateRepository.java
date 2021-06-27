package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Integer> {
}
