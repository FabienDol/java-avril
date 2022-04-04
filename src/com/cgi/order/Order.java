package com.cgi.order;

public class Order {

    private String ref;
    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Order(String ref, Drink drink, MainCourse mainCourse, Dessert dessert) {
        this.ref = ref;
        this.drink = drink;
        this. mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public float totalPrice() {

        return drink.getPrice() + mainCourse.getPrice() + dessert.getPrice();

    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ref='" + ref + '\'' +
                ", drink=" + drink +
                ", mainCourse=" + mainCourse +
                ", dessert=" + dessert +
                '}';
    }
}
