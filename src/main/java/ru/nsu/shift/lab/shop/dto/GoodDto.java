package ru.nsu.shift.lab.shop.dto;

import lombok.Data;
import ru.nsu.shift.lab.shop.utils.MonitorSize;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

@Data
public class GoodDto {
    private String type;
    private String serialNumber;
    private Integer count;
    private String manufacturer;
    private Integer price;
    private Integer diagonalInch;
    private Integer sizeGb;
    private MonitorSize monitorSize;
    private ShapeFactor shapeFactor;
}
