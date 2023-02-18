package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "good")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Good {
    @Id
    private String serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer count;
}
