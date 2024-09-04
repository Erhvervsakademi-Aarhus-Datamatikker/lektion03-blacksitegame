package opgave02;

public class FizzBuzz {
    public static void main(String[] args) {
        int currentNumber = 1;
        while (currentNumber <= 40) {
            //Indsæt din implementering af FizzBuzz her.

            //If Statements
            if (currentNumber%3==0 && currentNumber%5==0){
                System.out.println("FizzBuzz");
            }

            else if (currentNumber%5==0) {
                System.out.println("Buzz");

            }

            else if (currentNumber%3==0) {
                System.out.println("Fizz");
            }

            else {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }
}
