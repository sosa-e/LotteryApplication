import java.util.ArrayList;
import java.util.Random;

public class LotteryApplication {
    private int[] lottery = new int[5];
    // Function lottery generates a one-dimensional, five unit array
    public LotteryApplication(){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            lottery[i] = random.nextInt(10);
        }
        System.out.println();
    }

    public int[] getLotteryNumbers() {
        return lottery;
    }

    //Instance checkNumbers looks for any matching index between the two arrays
    public ArrayList<Integer> checkNumbers(int[] picks) {
        ArrayList<Integer> indexes = new ArrayList<>();

        int counter = 0;
        boolean match;
        //formatted strings to appear nicely in output
        System.out.printf("%1s%20s\n", "Your Numbers ", "Winning Numbers");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            match = false;
            if (picks[i] == lottery[i]) {
                match = true;
                counter++;
                indexes.add(i);
                // used a ternary operator to check if array indices match
                System.out.printf("%1s%19s%5s\n", picks[i], lottery[i], (match ? " (match)" : "(no match)" ));

            } else {
                System.out.printf("%1s%19s\n", picks[i], lottery[i]);
            }
        }
        if (counter == 5) {
            System.out.println("You win the grand prize");
        }
        return indexes;
    }
}
