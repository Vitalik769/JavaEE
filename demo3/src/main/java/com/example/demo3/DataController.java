package com.example.demo3;

import com.example.demo3.DataContainer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class DataController implements Serializable {
    private final DataContainer<String> container = new DataContainer<>();
    private String newItem; // Для додавання нового елемента

    public void addItem() {
        if (newItem != null && !newItem.isEmpty()) {
            container.add(newItem);
            newItem = ""; // Очистити поле після додавання
        }
    }

    public void removeItem(String item) {
        container.remove(item);
    }

    public String getNewItem() {
        return newItem;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }

    public DataContainer<String> getContainer() {
        return container;
    }
}

