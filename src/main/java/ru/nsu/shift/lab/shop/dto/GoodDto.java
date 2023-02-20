package ru.nsu.shift.lab.shop.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@JsonTypeInfo(
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "productType",
        use = JsonTypeInfo.Id.NAME,
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DesktopDto.class, name = "Desktop"),
        @JsonSubTypes.Type(value = LaptopDto.class, name = "Laptop"),
        @JsonSubTypes.Type(value = HardDiskDto.class, name = "Disk"),
        @JsonSubTypes.Type(value = MonitorDto.class, name = "Monitor")
})
@Data
public class GoodDto {
    @NotNull(message = "Type cannot be null")
    private String productType;
    @NotNull(message = "Serial number cannot be null")
    private String serialNumber;
    @NotNull(message = "Count cannot be null")
    private Integer count;
    @NotNull(message = "Manufacturer cannot be null")
    private String manufacturer;
    @NotNull(message = "Price cannot be null")
    private Integer price;
}
