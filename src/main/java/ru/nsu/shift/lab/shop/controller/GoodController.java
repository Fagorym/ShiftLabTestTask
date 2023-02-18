package ru.nsu.shift.lab.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.nsu.shift.lab.shop.dto.GoodDto;
import ru.nsu.shift.lab.shop.entity.Good;
import ru.nsu.shift.lab.shop.service.GoodService;

import java.util.List;

@Controller
@RequestMapping(value = "/good", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class GoodController {
    private final GoodService goodService;

    @GetMapping
    public ResponseEntity<List<Good>> get() {
        return ResponseEntity.ok(goodService.getAll());

    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody GoodDto goodDto) {
        return ResponseEntity.ok(goodService.saveGood(goodDto));

    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam String serialNumber){
        goodService.deleteGood(serialNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
