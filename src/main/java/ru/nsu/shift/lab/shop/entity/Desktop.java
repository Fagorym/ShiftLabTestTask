package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

@Entity
@Table(name = "desktop")
public class Desktop {
    @OneToOne
    @Id
    private Good good;
    @Enumerated
    private ShapeFactor shape;
}
