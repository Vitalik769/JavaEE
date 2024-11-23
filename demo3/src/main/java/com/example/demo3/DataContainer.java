package com.example.demo3;

import java.util.ArrayList;
import java.util.List;

public class DataContainer<T> {
    private final List<T> data = new ArrayList<>();

    // Додати елемент до контейнера
    public void add(T item) {
        data.add(item);
    }

    // Видалити елемент з контейнера
    public void remove(T item) {
        data.remove(item);
    }

    // Отримати всі елементи
    public List<T> getAll() {
        return new ArrayList<>(data);
    }
}
