package Oops.constructor;

public class Computer {
    int RAM;
    String GPU;
    String SSD;
    String Brand;

    public Computer(){
        System.out.println("The constructor is called ");
    }
    public  Computer(String BrandName){
        Brand= BrandName;
    }


}
