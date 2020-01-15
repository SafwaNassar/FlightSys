package io.FlightsBookingSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.FlightsBookingSystem.Model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

}
