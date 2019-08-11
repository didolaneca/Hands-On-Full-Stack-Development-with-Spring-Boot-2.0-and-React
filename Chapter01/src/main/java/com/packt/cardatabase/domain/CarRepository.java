package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import com.packt.cardatabase.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long>{

}
