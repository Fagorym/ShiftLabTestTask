package ru.nsu.shift.lab.shop.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonitorDto extends GoodDto {
    @NotNull
    @Min(value = 0)
    private Integer diagonalInch;
}
