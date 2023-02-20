package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "good")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class Good {
    @Id
    private String serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer count;
    @Column(insertable = false, updatable = false)
    private String dtype;
}
