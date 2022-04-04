package com.cgi.repartitor;

import java.util.ArrayList;

public class Repartitor {

    private ArrayList<Printer> printers = new ArrayList<>();
    private static Repartitor instance;
    private int printerIndex = 0;

    private Repartitor() {}

    public static Repartitor getInstance() {
        if (instance == null) {
            instance = new Repartitor();
        }
        return instance;
    }

    public void print(){
        System.out.println("Repartitor choisit l'imprimante " + printerIndex);
        System.out.println("Instance de Repartitor : " + Repartitor.getInstance());
        Printer printer = printers.get(printerIndex++);
        if (printerIndex >= printers.size()) {
            printerIndex = 0;
        }
    }

    public ArrayList<Printer> getPrinters() {
        return printers;
    }

    public void setPrinters(ArrayList<Printer> printers) {
        this.printers = printers;
    }

}
