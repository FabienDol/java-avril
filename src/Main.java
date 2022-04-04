import com.cgi.diagramme.BankInfo;
import com.cgi.diagramme.Company;
import com.cgi.diagramme.Employee;
import com.cgi.diagramme.Status;
import com.cgi.order.Dessert;
import com.cgi.order.Drink;
import com.cgi.order.MainCourse;
import com.cgi.order.Order;
import com.cgi.repartitor.Computer;
import com.cgi.repartitor.Printer;
import com.cgi.repartitor.Repartitor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //employees();

        //printersSingleton();

        enumOrder();

    }

    public static void employees(){
        Company company1 = new Company("CGI");
        BankInfo bankInfo1 = new BankInfo("A007", "Mirabaud");
        Status status1 = new Status(true, 2020);

        Employee employee1 = new Employee(001,"Eric", "Smith", 5000, company1, bankInfo1, status1);
        System.out.println(employee1);

        Employee employee2 = new Employee(001,"Eric", "Smith", 5000,
                company1,
                new BankInfo("B023", "BNP"),
                new Status(false, 2021));
        System.out.println(employee2);
    }

    public static void printersSingleton() {

        Printer p1 = new Printer("p1");
        Printer p2 = new Printer("p2");

        Repartitor.getInstance().getPrinters().add(p1);
        Repartitor.getInstance().getPrinters().add(p2);

        Computer com1 = new Computer("com1");
        Computer com2 = new Computer("com2");
        Computer com3 = new Computer("com3");

        com1.print();
        com2.print();
        com3.print();

        com2.print();
        com1.print();
        com3.print();

    }

    public static void enumOrder() {

        Drink drink1 = Drink.BEER;
        MainCourse mainCourse1 = MainCourse.BEEF;
        Dessert dessert1 = Dessert.ICECREAM;

        Order order1 = new Order("Order 1", drink1, mainCourse1, dessert1);

        System.out.println("Prix de la commande " + order1.getRef() + " : " + order1.totalPrice());

        System.out.println(order1.toString());

    }
}
