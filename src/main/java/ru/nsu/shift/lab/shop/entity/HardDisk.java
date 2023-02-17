package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.OneToOne;

public class HardDisk {
    @OneToOne
    private Good good;
    private Integer sizeGb;
}
