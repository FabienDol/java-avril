package com.cgi.diagramme;

public class Status {

    private boolean manager = false;
    private int year;

    public Status(int year) {
        this.year = year;
    }

    public Status(boolean manager, int year) {
        this.manager = manager;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Status{" +
                "manager=" + manager +
                ", year=" + year +
                '}';
    }
}
