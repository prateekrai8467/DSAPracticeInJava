package If_Else;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char playAgain;

        do {
            System.out.println("\n🎮 WELCOME TO NUMBER GUESSING GAME 🎮");
            System.out.println("Choose Difficulty:");
            System.out.println("1. Easy (10 attempts)");
            System.out.println("2. Medium (7 attempts)");
            System.out.println("3. Hard (5 attempts)");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            int attempts;

            if (choice == 1)
                attempts = 10;
            else if (choice == 2)
                attempts = 7;
            else
                attempts = 5;

            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int score = 0;

            System.out.println("\nI have chosen a number between 1 and 100!");
            System.out.println("You have " + attempts + " attempts. Good luck! 💪");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("\nAttempt " + i + " - Enter your guess: ");
                guess = sc.nextInt();

                int diff = Math.abs(number - guess);

                if (guess == number) {
                    score = (attempts - i + 1) * 10;
                    System.out.println("🎉 BOOM! Correct Guess!");
                    System.out.println("⭐ Your Score: " + score);
                    break;
                }
                else if (diff <= 5) {
                    System.out.println("🔥 VERY HOT! You are very close!");
                }
                else if (diff <= 15) {
                    System.out.println("🌤️ Warm! Getting closer!");
                }
                else {
                    System.out.println("❄️ Cold! Far away.");
                }

                if (i == attempts) {
                    System.out.println("\n❌ Game Over!");
                    System.out.println("The correct number was: " + number);
                    System.out.println("💡 Tip: Try changing strategy next time!");
                }
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n🎯 Thanks for playing! Keep practicing, you’re improving!");
    }
}

}
