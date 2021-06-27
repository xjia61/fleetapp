package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
