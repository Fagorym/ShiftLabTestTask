package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.enums.ShapeFactor;

@Entity
@Getter
@Setter
@DiscriminatorValue("Desktop")
public class Desktop extends Good {
    @Enumerated
    private ShapeFactor shape;
}
