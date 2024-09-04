package opgave01;

import java.util.Scanner;

public class Opgave01 {
    public static void main(String[] args) {

        //I create my scanner
        Scanner scanner = new Scanner(System.in);

        //My Variables
        double alcohol_below_16 = 1.2;
        double alcohol_above_18 = 16.5;

        //Input age and alcohol percentage
        System.out.println("Write your age: ");
        int age = scanner.nextInt();
        System.out.println("Write alcohol percentage: ");
        double alcohol_percentage = scanner.nextDouble();

        //If and Else Statements
        if (age<16 && alcohol_percentage<alcohol_below_16){
            System.out.println("Go Ahead");

        } else if (age<16 && alcohol_percentage>alcohol_below_16) {
            System.out.println("No alcohol for you my friend");

        } else if (age>=16 && age<18 && alcohol_percentage<alcohol_above_18) {
            System.out.println("Go Ahead");

        } else if (age>=16 && age<18 && alcohol_percentage>alcohol_above_18) {
            System.out.println("No alcohol for you my friend");
        }
        else {
            System.out.println("Go Ahead");
        }

    }
}
