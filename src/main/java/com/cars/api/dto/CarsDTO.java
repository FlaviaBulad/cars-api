package com.cars.api.dto;

import java.text.DecimalFormat;

public record CarsDTO(String modelo, String fabricante, String dataFabricacao, Double valor, int anoModelo) {
  
}