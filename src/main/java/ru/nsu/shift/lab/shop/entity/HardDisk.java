package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("Disk")
public class HardDisk extends Good {
    private Integer sizeGb;
}
