package com.carsapi.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.app.dto.CarsDTO;
import com.carsapi.app.model.Car;
import com.carsapi.app.repository.CarRepository;

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
  public void create(@RequestBody CarsDTO req){
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Valor: " + req.valor());

     repository.save(new Car(req));
    return "Created";
  }
}