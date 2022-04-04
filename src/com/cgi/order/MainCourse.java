package com.cgi.order;

public enum MainCourse {

    CHICKEN(20), BEEF(30), SALAD(10);

    private int price;

    MainCourse(int price) {
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
        return "MainCourse{" +
                "price=" + price +
                '}';
    }
}
