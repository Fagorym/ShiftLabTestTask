package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import ru.nsu.shift.lab.shop.utils.MonitorSize;

@Entity
@Table(name = "laptop")
public class Laptop {
    @OneToOne
    @Id
    private Good good;
    @Enumerated
    private MonitorSize size;
}
