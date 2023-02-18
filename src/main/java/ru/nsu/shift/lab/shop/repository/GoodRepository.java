package ru.nsu.shift.lab.shop.repository;


import org.springframework.data.repository.CrudRepository;
import ru.nsu.shift.lab.shop.entity.Good;

public interface GoodRepository extends CrudRepository<Good, Long> {
}
