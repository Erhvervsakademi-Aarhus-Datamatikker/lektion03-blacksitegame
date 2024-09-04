package opgave03;

import org.w3c.dom.Text;

import javax.print.DocFlavor;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.DayOfWeek;
import java.time.Year;
import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write day:");
        int day = scanner.nextInt();

        System.out.println("Write how many days you want to pass: ");
        int days_future = scanner.nextInt();

        int days_future_equation = (day+days_future)%7;

        if (day == 0) {
            System.out.println("Today is sunday");
        }

        else if (day == 1){
            System.out.println("Today is monday");
        }

        else if (day==2){
            System.out.println("Today is tuesday");
        }

        else if (day==3){
            System.out.println("Today is wednesday");
        }

        else if (day==4){
            System.out.println("Today is thursday");
        }

        else if (day==5){
            System.out.println("Today is friday");
        }

        else if(day==6){
            System.out.println("Today is saturday");
        }

        else {
            System.out.println("Nope");
        }

        if (days_future_equation==0) {
            System.out.println("Next day is Sunday");
        }

        else if (days_future_equation==1) {
            System.out.println("Next day is Monday");
        }

        else if (days_future_equation==2) {
            System.out.println("Next day is Tuesday");
        }

        else if (days_future_equation==3) {
            System.out.println("Next day is Wednesday");
        }

        else if (days_future_equation==4) {
            System.out.println("Next day is Thursday");
        }

        else if (days_future_equation==5) {
            System.out.println("Next day is Friday");
        }

        else {
            System.out.println("Next day is Saturday");
        }
    }
}





