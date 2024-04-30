package Oops.constructor;

public class App {
    public static void main(String[] args) {

    Computer computer1 = new Computer();
    Computer computer2 = new Computer();




    //Example of the method overloading
    Computer computer5 = new Computer("hp");
        System.out.println(computer5.Brand);

        Oops.GetterAndSetters.Computer computer3 = new Oops.GetterAndSetters.Computer();
        System.out.println(computer3.SSD);

    }
}
