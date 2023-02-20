package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Monitor extends Good {
    private Integer diagonalInch;
}
