package Oops.FinalKeyWord;

public class App {
    public static void main(String[] args) {
        Car car =new Car();
        car.setID(5);
        System.out.println(car.getID());
        Motorcycle motorcycle = new Motorcycle();

        motorcycle.setID(2);
        car.drive();
        motorcycle.drive();
    }
}
