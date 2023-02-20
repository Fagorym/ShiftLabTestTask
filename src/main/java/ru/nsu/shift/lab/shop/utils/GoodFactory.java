package ru.nsu.shift.lab.shop.utils;

import ru.nsu.shift.lab.shop.dto.*;
import ru.nsu.shift.lab.shop.entity.*;
import ru.nsu.shift.lab.shop.exception.InvalidTypeException;

import java.util.HashMap;
import java.util.Map;


public class GoodFactory {
    Map<String, Good> entityFactory;
    Map<String, GoodDto> dtoFactory;

    public GoodFactory() {
        entityFactory = new HashMap<>();
        dtoFactory = new HashMap<>();
        initEntityFactory();
        initDtoFactory();
    }

    private void initEntityFactory() {
        entityFactory.put("Laptop", new Laptop());
        entityFactory.put("Desktop", new Desktop());
        entityFactory.put("Disk", new HardDisk());
        entityFactory.put("Monitor", new Monitor());
    }

    private void initDtoFactory() {
        dtoFactory.put("Laptop", new LaptopDto());
        dtoFactory.put("Desktop", new DesktopDto());
        dtoFactory.put("Disk", new HardDiskDto());
        dtoFactory.put("Monitor", new MonitorDto());
    }

    public Class<? extends Good> getGoodEntity(String type) {
        Good good = entityFactory.get(type);
        if (good == null) {
            throw new InvalidTypeException("Product with type " + type + " does not exist");

        }
        return (good.getClass());

    }

    public Class<? extends GoodDto> getGoodDto(String type) {
        GoodDto goodDto = dtoFactory.get(type);
        return goodDto.getClass();
    }
}
