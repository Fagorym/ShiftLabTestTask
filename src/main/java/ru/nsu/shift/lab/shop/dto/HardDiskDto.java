package ru.nsu.shift.lab.shop.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HardDiskDto extends GoodDto {
    @Min(value = 0)
    @NotNull
    private Integer sizeGb;
}
