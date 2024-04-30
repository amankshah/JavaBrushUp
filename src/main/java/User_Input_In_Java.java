import java.util.Scanner;

public class User_Input_In_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You need to type Something:");
        String input = scanner.nextLine();
        System.out.println("User has entered "+input);

        System.out.println("You need to type integer");
        Integer number = scanner.nextInt();
        System.out.println("User has entered the number " + number);

    }
}
