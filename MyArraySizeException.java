package ru.geekbrains.homework.lesson2;

public class MyArraySizeException extends RuntimeException {
    private int size;

    public int getSize() {
        return size;
    }

    public MyArraySizeException(String message, int size) {
        super(message);
        this.size = size;
    }
}
