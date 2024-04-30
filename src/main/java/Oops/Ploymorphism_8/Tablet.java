package Oops.Ploymorphism_8;

public class Tablet extends Computer {
    @Override
    public void start() {
        System.out.println("Tablet started");
    }
    @Override
    public void showInfo() {
        System.out.println("Tablet Info");
    }
}
