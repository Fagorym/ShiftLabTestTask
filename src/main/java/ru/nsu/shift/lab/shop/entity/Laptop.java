package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.enums.MonitorSize;

@Entity
@Getter
@Setter
@DiscriminatorValue("Laptop")
public class Laptop extends Good {
    @Enumerated(value = EnumType.ORDINAL)
    private MonitorSize monitorSize;
}
