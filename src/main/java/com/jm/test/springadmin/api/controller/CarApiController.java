package com.jm.test.springadmin.api.controller;

import com.jm.test.springadmin.api.service.CarService;
import com.jm.test.springadmin.dao.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarApiController
{
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> findAll()
    {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car findById(@PathVariable Long id)
    {
        return carService.findById(id);
    }

    @PutMapping
    public Car save(@RequestBody Car car)
    {
        return carService.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        carService.deleteById(id);
    }
}
