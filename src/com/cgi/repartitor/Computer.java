package com.cgi.repartitor;

public class Computer {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("******************");
        System.out.println("print du Computer " + this.getName());
        Repartitor.getInstance().print();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}
