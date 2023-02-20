package ru.nsu.shift.lab.shop.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.enums.MonitorSize;

@Getter
@Setter
public class LaptopDto extends GoodDto{
    @NotNull
    private MonitorSize monitorSize;
}
