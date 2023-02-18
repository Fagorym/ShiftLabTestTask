package ru.nsu.shift.lab.shop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.shift.lab.shop.entity.Good;

public interface GoodRepository extends JpaRepository<Good, Long> {
}
