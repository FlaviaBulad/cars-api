package com.carsapi.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.app.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarController {
  
  @PostMapping
  public void create(@RequestBody CarsDTO req){
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Valor: " + req.valor());
  }
}