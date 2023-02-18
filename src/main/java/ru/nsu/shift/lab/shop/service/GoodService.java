package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.dto.GoodDto;
import ru.nsu.shift.lab.shop.entity.*;
import ru.nsu.shift.lab.shop.repository.GoodRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;

    private final ModelMapper modelMapper;

    public List<Good> getAll() {
        return goodRepository.findAll();
    }

    public String saveGood(GoodDto goodDto) {
        Good newGood;

        switch (goodDto.getType()) {
            case "monitor" -> newGood = modelMapper.map(goodDto, Monitor.class);

            case "disk" -> newGood = modelMapper.map(goodDto, HardDisk.class);

            case "laptop" -> newGood = modelMapper.map(goodDto, Laptop.class);

            case "desktop" -> newGood = modelMapper.map(goodDto, Desktop.class);

            default -> throw new RuntimeException("Hello");
        }
        return goodRepository.save(newGood).getSerialNumber();
    }
}
