package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

@Entity
public class Desktop extends Good {
    @Enumerated
    private ShapeFactor shape;
}
