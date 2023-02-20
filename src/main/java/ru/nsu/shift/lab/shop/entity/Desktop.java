package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

@Entity
@Getter
@Setter
public class Desktop extends Good {
    @Enumerated
    private ShapeFactor shape;
}
