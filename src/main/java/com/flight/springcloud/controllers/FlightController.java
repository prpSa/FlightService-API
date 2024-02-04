package com.flight.springcloud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.flight.springcloud.model.Flight;
import com.flight.springcloud.repos.FlightRepository;

@RestController
public class FlightController {

	@Autowired
	FlightRepository repo;

	@PostMapping("/flight")
	public Flight addFlight(@RequestBody Flight flight){
		return repo.save(flight);
	}

	@GetMapping("/flight/{id}")
	public Optional<Flight> getFlight(@PathVariable("id") Long id){
		return repo.findById(id);
	}

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repo.findAll();
	}

}
