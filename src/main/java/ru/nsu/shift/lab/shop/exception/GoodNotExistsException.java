package ru.nsu.shift.lab.shop.exception;

public class GoodNotExistsException extends RuntimeException {
    public GoodNotExistsException(String msg) {
        super(msg);
    }
}
