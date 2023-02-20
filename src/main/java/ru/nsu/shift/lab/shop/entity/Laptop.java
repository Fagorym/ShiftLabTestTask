package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.utils.MonitorSize;

@Entity
@Getter
@Setter
public class Laptop extends Good {
    @Enumerated
    private MonitorSize size;
}
