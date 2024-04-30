package Oops.GetterAndSetters;

public class Computer {
    private int RAM; //Using private we are hiding the data , it can not be accessed outside the class.

    protected String GPU; //Using Protected --> it cannot be accessed outside the package.

    public String SSD; //Public --> Data is open form every where.

     String Brand;

    public Computer(){
        System.out.println("The constructor is called ");
    }



    //Encapsulation : Hiding the properties so that is should not be accessible and visible to others

    public int getRAM(){
        return  this.RAM;
    }
    public String getGPU(){
        return  this.GPU;
    }

}
