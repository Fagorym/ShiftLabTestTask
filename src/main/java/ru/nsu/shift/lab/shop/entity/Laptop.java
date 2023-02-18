package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import ru.nsu.shift.lab.shop.utils.MonitorSize;

@Entity
public class Laptop extends Good {
    @Enumerated
    private MonitorSize size;
}
