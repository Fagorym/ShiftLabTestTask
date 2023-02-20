package ru.nsu.shift.lab.shop.dto;

import lombok.Getter;
import lombok.Setter;
import ru.nsu.shift.lab.shop.enums.ShapeFactor;

@Getter
@Setter
public class DesktopDto extends GoodDto{
    private ShapeFactor shapeFactor;
}
