package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("Monitor")
public class Monitor extends Good {
    private Integer diagonalInch;
}
