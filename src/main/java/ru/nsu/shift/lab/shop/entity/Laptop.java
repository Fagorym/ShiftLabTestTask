package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import ru.nsu.shift.lab.shop.utils.MonitorSize;

public class Laptop {
    @OneToOne
    Good good;
    @Enumerated
    MonitorSize size;
}
