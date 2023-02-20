package ru.nsu.shift.lab.shop.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "good")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@DiscriminatorColumn(name="product_type",
        discriminatorType = DiscriminatorType.STRING)
public class Good {
    @Id
    private String serialNumber;
    private String manufacturer;
    private Integer price;
    private Integer count;
    @Column(name = "product_type", insertable = false, updatable = false)
    private String productType;
}
