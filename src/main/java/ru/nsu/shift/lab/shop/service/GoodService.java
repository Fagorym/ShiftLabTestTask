package ru.nsu.shift.lab.shop.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.shift.lab.shop.repository.GoodRepository;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;
    
}
