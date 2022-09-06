package ru.netology.domain;

import ru.netology.domain.Product;

public class Smartphone extends Product {
    private String producer;

    public Smartphone(int id, String name, int price) {
        super(id, name, price);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
