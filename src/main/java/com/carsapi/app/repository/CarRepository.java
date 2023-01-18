package com.carsapi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsapi.app.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}