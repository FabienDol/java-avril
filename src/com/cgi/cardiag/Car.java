package com.cgi.cardiag;

public class Car {

    private int id;
    private static int count;
    private int speed =0;
    private int maxSpeed = 220;
    private CarInfo carInfo;

    public Car(CarInfo carInfo) {
        this.carInfo = carInfo;
        this.id = ++count;
    }

    public Car(CarInfo carInfo, int speed) {
        this(carInfo);
        this.setSpeed(speed);
    }

    public Car(String serialNumber, String brand, int speed) {
        this.carInfo = new CarInfo(serialNumber, brand);
        this.setSpeed(speed);
        // ici rajouter l'incrémentation de l'id ou bien inclure l'autre constructeur ?
    }

    public static String compare(Car v1, Car v2) {
        if (v1.getSpeed() > v2.getSpeed()) {
            return "Car " + v1 + " is going faster than car " + v2;
        } else if (v1.getSpeed() < v2.getSpeed()){
            return "Car " + v2 + " is going faster than car " + v1;
        } else {
            return "Same speed";
        }
    }

    public String compare(Car v) {
        if (this.getSpeed() > v.getSpeed()) {
            return "Car " + this + " is going faster than car " + v;
        } else if (this.getSpeed() < v.getSpeed()) {
            return "Car " + v + " is going faster than car " + this;
        } else {
            return "Same speed";
        }
        // ici on aurait pu juste utiliser l'autre méthode compare au lieu de tout réécrire
    }

    public void accelerate(int speed) {
        this.speed += speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    public void decelerate(int speed) {
        this.speed -= speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.min(speed, this.maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", carInfo=" + carInfo +
                '}';
    }
}
