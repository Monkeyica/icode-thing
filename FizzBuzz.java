import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean keepPlaying = true;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number:");
            int myNum = myScanner.nextInt();

            if (myNum % 3 == 0 && myNum % 5 == 0) {
                System.out.println("FIZZ-BUZZ");
            }
            else if (myNum % 3 == 0) {
                System.out.println("FIZZ");
            }
            else if (myNum % 5 == 0) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println("_______");
            }

            System.out.println("Keep playing? (true/false)");
            keepPlaying = myScanner.nextBoolean();

            if (!keepPlaying) {
                break;
            }
        }

        myScanner.close();
    }
}
