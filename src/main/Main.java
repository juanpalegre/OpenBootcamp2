package main;

import entities.SmartPhone;
import entities.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Apple", "21", 200.0, "Personal");

        SmartWatch smartWatch = new SmartWatch("Siaomi", "Exced7", 50.0, "Negro");

        System.out.println(smartPhone.darBienvenidaAlUsuario());
        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }

}
