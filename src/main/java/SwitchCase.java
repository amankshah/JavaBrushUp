import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner dayOfWeekInp = new Scanner(System.in); //implemented and added use input

        System.out.println("Enter Day of week :");
        int dayOfWeek =dayOfWeekInp.nextInt();
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
             case 3:
                System.out.println("Wed");
                break;
             case 4:
                System.out.println("Thu");
                break;
             case 5:
                System.out.println("FRI");
                break;
              case 6:
                System.out.println("SAT");
                break;
              case 7:
                System.out.println("SUN");
                break;

            default:
                System.out.printf("An icorrect value is entered ");

        }
    }
}
