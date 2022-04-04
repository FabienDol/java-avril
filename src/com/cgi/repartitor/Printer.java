package com.cgi.repartitor;

public class Printer {

    private String model;

    public Printer(String model) {
        this.model = model;
    }

    public void print(){
        System.out.println("print de Printer " + this.getModel());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "model='" + model + '\'' +
                '}';
    }
}
