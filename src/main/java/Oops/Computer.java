package Oops;

public class Computer {
    int RAM;
    String GPU;
    String SSD;
    String Brand;

    public Computer(){
        System.out.println("This is a metod");
    }


    //methods
    void ShowInfo(){
        System.out.println("The Ram of this Computer is " + RAM + " and have " + SSD + " SSD.");
    }
    String showSpecs(){
        return ("The Ram of this Computer is " + RAM + " and have " + SSD + " SSD.");
    }

    int addition (int fNum , int sNum){
        return  fNum + sNum;

    }
    //Method Overloading
    int addition (int fNum , int sNum , int tNum){
        System.out.println("This is after overloading");
        return  fNum + sNum +tNum ;

    }

}
