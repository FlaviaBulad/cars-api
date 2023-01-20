package com.cars.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;
import com.cars.api.model.Car;
import com.cars.api.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

   @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAll() {
    return repository.findAll();
  }
  
  @PostMapping
  public String create(@RequestBody CarsDTO req){
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Valor: " + req.valor());

     repository.save(new Car(req));
    return "Created";
  }
}