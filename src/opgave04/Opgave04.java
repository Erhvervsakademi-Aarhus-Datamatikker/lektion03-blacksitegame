package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rock = 0;
        int paper = 1;
        int scissor = 2;

        System.out.println("Rock (0), Paper (1), Scissor (2): ");
        int Rock_Paper_scissor_number = scanner.nextInt();

        int computer_number = (int)(Math.random()*3);

        if (Rock_Paper_scissor_number==0){
            if (computer_number==0){
                System.out.println("You chose Rock. Computer chose rock. Its a draw");
            }
            else if (computer_number==1) {
                System.out.println("You chose Rock. Computer chose paper. You lost");
            }
            else {
                System.out.println("You chose rock. Computer chose scissor. You won");
            }

        }

        else if (Rock_Paper_scissor_number==1) {
            if (computer_number == 0) {
                System.out.println("You chose Paper. Computer chose rock. You a won");
            } else if (computer_number == 1) {
                System.out.println("You chose Paper. Computer chose paper. Its a draw");
            } else {
                System.out.println("You chose rock. Computer chose scissor. You lost");
            }
            if (Rock_Paper_scissor_number > computer_number) {
                System.out.println("You won");
            }

        }
        else if (Rock_Paper_scissor_number==2) {
            if (computer_number == 0) {
                System.out.println("You chose Scissor. Computer chose rock. You lost");
            } else if (computer_number == 1) {
                System.out.println("You chose Scissor. Computer chose paper. You won");
            } else {
                System.out.println("You chose Scissor. Computer chose scissor. Its a draw");
            }
        }
    }
}
