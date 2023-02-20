package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.dto.GoodDto;
import ru.nsu.shift.lab.shop.entity.*;
import ru.nsu.shift.lab.shop.exception.GoodNotExistsException;
import ru.nsu.shift.lab.shop.exception.InvalidTypeException;
import ru.nsu.shift.lab.shop.exception.NullFieldException;
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
                    throw new NullFieldException("Diagonal size cannot be null for monitor");
                }
                newGood = modelMapper.map(goodDto, Monitor.class);
            }

            case "disk" -> {
                if (goodDto.getSizeGb() == null) {
                    throw new NullFieldException("Size cannot be null for disk");
                }
                newGood = modelMapper.map(goodDto, HardDisk.class);
            }

            case "laptop" -> {
                if (goodDto.getMonitorSize() == null) {
                    throw new NullFieldException("Monitor size cannot be null for laptop");
                }
                newGood = modelMapper.map(goodDto, Laptop.class);
            }

            case "desktop" -> {
                if (goodDto.getShapeFactor() == null) {
                    throw new NullFieldException("Shape factor cannot be null for desktop");
                }
                newGood = modelMapper.map(goodDto, Desktop.class);
            }

            default -> throw new InvalidTypeException("This type does not exist");
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

    public GoodDto getByNumber(Long serialNumber) {
        return null;
    }
}
