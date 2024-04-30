package Oops.Interface_7;

public class Computer implements info {
    private int id=1;
    public  void  start(){
        System.out.println("Computer Started");
    }
    public void showInfo(){
        System.out.println("Computer Info" + id);
    }
}
