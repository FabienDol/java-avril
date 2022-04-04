package com.cgi.cardiag;

import java.util.ArrayList;
import java.util.Iterator;

public class Parking {

    private String name;
    private String city;
    private String adress;

    private ArrayList<Car> cars = new ArrayList<>();

    public Parking(String name, String city, String adress) {
        this.name = name;
        this.city = city;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int countByBrand(String brand) {
        int count = 0;

        for (Car car : this.cars) {
            if (car.getCarInfo().getBrand() == brand) {
                count++;
            }
        }
        return count;
    }

    public void add(Car c) {
        this.cars.add(c);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", cars=" + cars +
                '}';
    }
}
