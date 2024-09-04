package opgave01;

import java.util.Scanner;

public class Opgave01 {
    public static void main(String[] args) {

        //Scanner

        Scanner scanner = new Scanner(System.in);

        //Variables

        double low_alcohol=1.2;
        double high_alcohol=16.5;

        //Inputs

        System.out.println("Skriv din alder: ");
        int alder = scanner.nextInt();

        System.out.println("Skriv alkohol procent: ");
        double alcohol_percentage = scanner.nextDouble();

        //If and else statements

        if (alcohol_percentage>low_alcohol && alder<16){
            System.out.println("Nope");
        }

        else if (alcohol_percentage>high_alcohol && alder<18){
            System.out.println("nope");
        }
        else {
            System.out.println("Go Ahead");
        }
    }
}
