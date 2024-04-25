public class IfStatement {
    public static void main(String[] args) {
        int Var=9;

        if (Var < 5){
            System.out.println("Under 5");
        } else if (Var<10) {
            System.out.println("Under 10 ");
        } else if (Var>10 && Var<15) {
            System.out.println("Grater then 10 and under 15");

        }else {
            System.out.println("Grand Grand Grater");
        }
    }
}
