package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "disks")
public class HardDisk {
    @OneToOne
    @Id
    private Good good;
    private Integer sizeGb;
}
