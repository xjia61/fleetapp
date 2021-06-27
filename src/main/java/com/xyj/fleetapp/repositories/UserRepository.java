package com.xyj.fleetapp.repositories;

import com.xyj.fleetapp.models.Client;
import com.xyj.fleetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
