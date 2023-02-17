package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

public class Desktop {
    @OneToOne
    private Good good;
    @Enumerated
    private ShapeFactor shape;
}
