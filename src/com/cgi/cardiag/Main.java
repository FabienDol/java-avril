package com.cgi.cardiag;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("A001", "Toyota", 150);
        Car car2 = new Car("B007", "Toyota", 300);
        Car car3 = new Car("A001", "Audi", 200);
        Car car4 = new Car("C023", "Renault", 100);
        Car car5 = new Car("D023", "Volkswagen", 100);


        Parking p1 = new Parking("parking1", "Montpellier", "adresse random");
        p1.add(car1);
        p1.add(car2);
        p1.add(car3);

        System.out.println("nombre de Toyota dans p1 : " + p1.countByBrand("Toyota"));
        System.out.println("nombre de Audi dans p1 : " + p1.countByBrand("Audi"));

        System.out.println(Car.compare(car1, car2));
        System.out.println(Car.compare(car2, car3));
        System.out.println(Car.compare(car4, car5));

        System.out.println(car1.compare(car2));
        System.out.println(car2.compare(car3));

        System.out.println("Vitesse de base de car4 : " + car4.getSpeed());
        car4.accelerate(10);
        System.out.println("Vitesse modifiée de car4 " + car4.getSpeed());



    }
}
