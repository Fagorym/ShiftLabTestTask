package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.entity.Good;
import ru.nsu.shift.lab.shop.repository.GoodRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;

    public List<Good> getAll() {
        return goodRepository.findAll();
    }
}
