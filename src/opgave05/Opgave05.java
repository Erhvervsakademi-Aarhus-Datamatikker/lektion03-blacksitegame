package opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast nypris: ");
        int price = input.nextInt();
        double registrationFee = calculateFee(price);
        System.out.println("En bil der koster " + price + " uden registreringsafgift, skal man betale " +
                registrationFee + " i registreringsafgift.");
    }

    public static double calculateFee(int price) {

        double new_price;

        if (price<67800){
            new_price=price*0.25;
        }

        else if (price<210600){
            new_price=(price-67800)*0.85+67800*0.25;
        }
        else {
            new_price=(price-210600)*1.5+(210600-67800)*0.85+67800*0.25;
        }
        return new_price;
    }
}
