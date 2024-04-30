package Oops.Ploymorphism_8;

public class App {

    public static void main(String[] args) {
        Computer lap = new Laptops();
        lap.start();
        lap.showInfo();
        Computer phone = new Phone();
        phone.start();
        phone.showInfo();
        Computer tab = new Tablet();
        tab.start();
        tab.showInfo();

        Phone p = new Phone();
        p.start();
        p.showInfo();

//        add example of polymorphism



    }
}
