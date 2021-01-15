package ifdemo;
import java.util.Scanner;

public class ifdemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Age");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 180){
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        }
        else if (userAge < 18){
            System.out.println("Sorry you are underage");
        }
        else if (userAge < 21){
            System.out.println("You need parental consent");
        }
        else {
            System.out.println("Congratulations!");
            System.out.println("You may sing for the event");
        }
    }
}
