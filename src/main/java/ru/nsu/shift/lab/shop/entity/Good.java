package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "good")
public class Good {
    @Id
    private String serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer count;
}
