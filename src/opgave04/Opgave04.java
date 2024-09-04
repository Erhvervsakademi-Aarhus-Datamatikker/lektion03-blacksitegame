package opgave04;

import javax.print.DocFlavor;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Opgave04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rock = 0;
        int paper = 1;
        int scissor = 2;

        System.out.println("Rock (0), Paper (1), Scissor (2): ");
        int user_input = scanner.nextInt();

        System.out.println("Computers turn: ");
        int Computer_Input = (int) (Math.random() * 3);

        if (user_input == 0) {
            if (Computer_Input == 0) {
                System.out.println("User: Rock. Computer: Rock. Draw");
            } else if (Computer_Input == 1) {
                System.out.println("User: Rock. Computer: Paper. Winner: Computer");
            } else if (Computer_Input == 2) {
                System.out.println("User: Rock. Computer: Scissor. Winner: User");
            }

        }
        else if (user_input == 1) {
            if (Computer_Input == 0) {
                System.out.println("User: Paper. Computer: Rock. Winner: User");
            }
            else if (Computer_Input == 1) {
                System.out.println("User: Paper. Computer: Paper. Draw");
            }
            else if (Computer_Input == 2) {
                System.out.println("User: Paper. Computer: Scissor. Winner: Computer");
            }

        }
        else if (user_input == 2) {
            if (Computer_Input == 0) {
                System.out.println("User: Scissor. Computer: Rock. Winner: Computer");
            }
            else if (Computer_Input == 1) {
                System.out.println("User: Scissor. Computer: Paper. Winner: User");
            }
            else if (Computer_Input == 2) {
                System.out.println("User: Scissor. Computer: Scissor. Draw");
            }
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}

