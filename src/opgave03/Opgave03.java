package opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {

        //I create my scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter todays day: ");
        int today_day = scanner.nextInt();

        if (today_day > 6 || today_day < 0) {
            System.out.println("Nope");
        }
        else {
            if (today_day==0){
                System.out.println("Today is sunday");
            }
            else if (today_day==1) {
                System.out.println("Today is monday");
            }
            else if (today_day==2) {
                System.out.println("Today is tuesday");
            }
            else if (today_day==3) {
                System.out.println("Today is wednesday");
            }
            else if (today_day==4) {
                System.out.println("Today is thursday");
            }
            else if (today_day==5) {
                System.out.println("Today is friday");
            }
            else if (today_day==6) {
                System.out.println("Today is saturday");
            }
        }

        System.out.println("Enter number of days elapsed since today: ");

        int days_elapsed = scanner.nextInt();

        int next_day=(today_day+days_elapsed)%7;

         if (next_day==0){
            System.out.println("Next day is sunday");
        }
        else if (next_day==1) {
            System.out.println("Next day is monday");
        }
        else if (next_day==2) {
            System.out.println("Next day is tuesday");
        }
        else if (next_day==3) {
            System.out.println("Next day is wednesday");
        }
        else if (next_day==4) {
            System.out.println("Next day is thursday");
        }
        else if (next_day==5) {
            System.out.println("Next day is friday");
        }
        else if (next_day==6) {
            System.out.println("Next day is saturday");
        }



    }
}
