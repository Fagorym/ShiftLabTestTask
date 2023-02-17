package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.OneToOne;

public class Monitor {
    @OneToOne
    private Good good;
    private Integer diagonalInch;
}
