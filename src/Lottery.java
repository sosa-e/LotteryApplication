import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int [] userNumbers = new int[5];
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Lottery! \nPlease type a number between 0-9");
        for (int i = 0; i <5; i++) {
            System.out.print("Enter #" + (i+1) + ": ");
            userNumbers[i] = myObj.nextInt();
        }
        LotteryApplication app = new LotteryApplication();

        ArrayList<Integer> result = app.checkNumbers(userNumbers);

        System.out.println("\nThe indexes that match are: " + result);

    }
}
