package ru.nsu.shift.lab.shop.dto;

import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.enums.MonitorSize;

@Getter
@Setter
public class LaptopDto extends GoodDto{
    private MonitorSize monitorSize;
}
