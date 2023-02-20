package ru.nsu.shift.lab.shop.exception;

public class GoodAlreadyExistsException extends RuntimeException {
    public GoodAlreadyExistsException(String msg) {
        super(msg);
    }
}
