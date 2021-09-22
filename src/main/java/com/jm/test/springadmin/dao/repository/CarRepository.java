package com.jm.test.springadmin.dao.repository;

import com.jm.test.springadmin.dao.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long>
{
}
