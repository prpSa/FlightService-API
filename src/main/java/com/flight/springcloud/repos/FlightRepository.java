package com.flight.springcloud.repos;

import com.flight.springcloud.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {

}
