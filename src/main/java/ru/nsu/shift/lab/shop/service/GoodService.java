package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.dto.GoodDto;
import ru.nsu.shift.lab.shop.entity.*;
import ru.nsu.shift.lab.shop.exception.GoodAlreadyExistsException;
import ru.nsu.shift.lab.shop.exception.GoodNotExistsException;
import ru.nsu.shift.lab.shop.repository.GoodRepository;
import ru.nsu.shift.lab.shop.utils.GoodFactory;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;

    private final ModelMapper modelMapper;

    private final GoodFactory goodFactory = new GoodFactory();

    public String saveGood(GoodDto goodDto) {
        if (goodRepository.existsBySerialNumber(goodDto.getSerialNumber())) {
            throw new GoodAlreadyExistsException("Good with serial number " +
                    goodDto.getSerialNumber() + " already exists");
        }
        Good newGood = modelMapper.map(goodDto, goodFactory.getGoodEntity(goodDto.getProductType()));

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

    public GoodDto getByNumber(String serialNumber) {
        Good good = goodRepository.findBySerialNumber(serialNumber)
                .orElseThrow(() -> {
                    throw new GoodNotExistsException("Good with serial number " +
                            serialNumber + " does not exist");
                });

        return modelMapper.map(good, goodFactory.getGoodDto(good.getProductType()));
    }

    public List<? extends GoodDto> getAllByType(String productType) {
        return goodRepository.findByProductType(productType)
                .stream()
                .map(good -> modelMapper.map(good, goodFactory.getGoodDto(good.getProductType())))
                .toList();

    }

    public void editGood(GoodDto goodDto) {
        if (!goodRepository.existsBySerialNumber(goodDto.getSerialNumber())) {
            throw new GoodNotExistsException("Good with serial number " + goodDto.getSerialNumber() +
                    "does not exist");
        } else {
            goodRepository.save(modelMapper.map(goodDto, goodFactory.getGoodEntity(goodDto.getProductType())));
        }
    }
}
