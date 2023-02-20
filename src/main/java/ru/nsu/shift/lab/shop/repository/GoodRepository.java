package ru.nsu.shift.lab.shop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.nsu.shift.lab.shop.entity.Good;

import java.util.List;
import java.util.Optional;

public interface GoodRepository extends JpaRepository<Good, Long> {
    Optional<Good> findBySerialNumber(String serialNumber);
    boolean existsBySerialNumber(String serialNumber);

    List<Good> findByDtype(String dtype);
}
