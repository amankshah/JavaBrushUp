package Oops.Ploymorphism_8;

public class Laptops extends Computer{
    @Override
    public void start(){
        System.out.println("Laptop started");
    }
    @Override
    public void showInfo(){
        System.out.println("Laptop Info");
    }
}
