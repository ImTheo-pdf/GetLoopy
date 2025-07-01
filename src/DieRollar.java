import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String userInput;

        do{
            int rollCount = 0;
            boolean gotTriple = false;

            System.out.printf("\nRoll\tDie1\tDie2\tDie3\tSum\n");
            System.out.println("--------------------------------------------------");

            while (!gotTriple) {
                rollCount++;

                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;

                int sum = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, sum); // formatting

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                }
            }

            System.out.print("\nThrow again? (y/n): ");
            userInput = in.nextLine();

        }while(userInput.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");

    }
}
