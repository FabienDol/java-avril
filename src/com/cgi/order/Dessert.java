package com.cgi.order;

public enum Dessert {

    ICECREAM(12), CHOCOSNACK(8);

    private int price;

    private Dessert(int price) {
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
        return "Dessert{" +
                "price=" + price +
                '}';
    }
}
