package AbstractFactoryPattern;

import AbstractFactoryPattern.Laptop;

public class SamsungLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Samsung Laptop.");
    }
}
