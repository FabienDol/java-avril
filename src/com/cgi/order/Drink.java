package com.cgi.order;

public enum Drink {

    BEER(10), WATER(5), COKE(8);

    private int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                '}';
    }
}
