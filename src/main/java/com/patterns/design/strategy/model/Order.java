package com.patterns.design.strategy.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Order {

    private final String id;

    private final LocalDate date;

    private final Map<String, Double> items = new HashMap<>();

    private double total;

    public Order(String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public void addItem(String name, double price) {
        items.put(name, price);
        total+= price;
    }
}
