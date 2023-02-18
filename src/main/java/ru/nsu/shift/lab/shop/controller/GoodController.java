package ru.nsu.shift.lab.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nsu.shift.lab.shop.entity.Good;
import ru.nsu.shift.lab.shop.service.GoodService;

import java.util.List;

@RequestMapping(value = "/good", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class GoodController {
    private final GoodService goodService;

    @GetMapping
    public ResponseEntity<List<Good>> get() {
        return ResponseEntity.ok(goodService.getAll());

    }

}
