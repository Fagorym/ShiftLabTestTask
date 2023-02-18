package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.dto.GoodDto;
import ru.nsu.shift.lab.shop.entity.*;
import ru.nsu.shift.lab.shop.exception.GoodNotExistsException;
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
            case "monitor" -> {
                if (goodDto.getDiagonalInch() == null) {
                    throw new IllegalStateException("Diagonal size cannot be null for monitor");
                }
                newGood = modelMapper.map(goodDto, Monitor.class);
            }

            case "disk" -> {
                if (goodDto.getSizeGb() == null) {
                    throw new IllegalStateException("Size cannot be null for disk");
                }
                newGood = modelMapper.map(goodDto, HardDisk.class);
            }

            case "laptop" -> {
                if (goodDto.getMonitorSize() == null) {
                    throw new IllegalStateException("Monitor size cannot be null for laptop");
                }
                newGood = modelMapper.map(goodDto, Laptop.class);
            }

            case "desktop" -> {
                if (goodDto.getShapeFactor() == null) {
                    throw new IllegalStateException("Shape factor cannot be null for desktop");
                }
                newGood = modelMapper.map(goodDto, Desktop.class);
            }

            default -> throw new RuntimeException("Hello");
        }
        return goodRepository.save(newGood).getSerialNumber();
    }

    public void deleteGood(String serialNumber) {
        Good good = goodRepository
                .findBySerialNumber(serialNumber)
                .orElseThrow(() -> {
                    throw new GoodNotExistsException("Good with number " +
                            serialNumber + " not exist");
                });
        goodRepository.delete(good);
    }
}
