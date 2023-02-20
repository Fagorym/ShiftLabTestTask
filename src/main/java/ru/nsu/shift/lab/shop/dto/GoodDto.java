package ru.nsu.shift.lab.shop.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.nsu.shift.lab.shop.utils.MonitorSize;
import ru.nsu.shift.lab.shop.utils.ShapeFactor;

@Data
public class GoodDto {
    @NotNull(message = "Type cannot be null")
    private String type;
    @NotNull(message = "Serial number cannot be null")
    private String serialNumber;
    @NotNull(message = "Count cannot be null")
    private Integer count;
    @NotNull(message = "Manufacturer cannot be null")
    private String manufacturer;
    @NotNull(message = "Price cannot be null")
    private Integer price;

    private Integer diagonalInch;
    private Integer sizeGb;
    private MonitorSize monitorSize;
    private ShapeFactor shapeFactor;
}
