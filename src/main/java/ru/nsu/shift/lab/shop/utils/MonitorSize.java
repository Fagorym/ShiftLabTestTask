package ru.nsu.shift.lab.shop.utils;

public enum MonitorSize {
    SMALL(13), MEDIUM(14), BIG(15), LARGE(17);

    private final Integer size;
    MonitorSize(int size) {
        this.size = size;
    }
}
