package InputDemo;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.println("Enter an Double");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);

        System.out.println("Enter an String");
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);

    }
}
