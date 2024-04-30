package Oops;

public class App {
    public static void main(String[] args) {
        Computer computer1  = new Computer();
        computer1.GPU="Nvidia";
        computer1.RAM =1024;
        computer1.Brand ="Hp";
        computer1.SSD= "256Gb";


        System.out.println(computer1.RAM);
        System.out.println(computer1.showSpecs());

        System.out.println(computer1.addition(3,4));
        //After method overloading
        System.out.println(computer1.addition(2,3,4));









    }
}
