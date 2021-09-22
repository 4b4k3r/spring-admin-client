package com.jm.test.springadmin.dao.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String yearOfProduction;
    private String model;
    private String color;
}
