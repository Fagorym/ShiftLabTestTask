package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HardDisk extends Good {
    private Integer sizeGb;
}
