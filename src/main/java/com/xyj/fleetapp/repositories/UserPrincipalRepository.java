package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.UserPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPrincipalRepository extends JpaRepository<UserPrincipal,Integer> {
}
