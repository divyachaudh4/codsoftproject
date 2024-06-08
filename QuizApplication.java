import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizApplication {
    private static final int QUIZ_DURATION = 60; 
    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startQuiz(scanner);
    }

    public static void startQuiz(Scanner scanner) {
        System.out.println("Welcome to the Quiz! You have " + QUIZ_DURATION + " seconds to answer.");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int secondsLeft = QUIZ_DURATION;

            @Override
            public void run() {
                if (secondsLeft > 0) {
                    System.out.println("Time left: " + secondsLeft + " seconds");
                    secondsLeft--;
                } else {
                    System.out.println("Time's up!");
                    endQuiz(scanner, timer);
                }
            }
        }, 0, 1000); 
        System.out.println("1. What is the capital of France?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("Paris")) {
            score++;
        }

        System.out.println("2. What is the powerhouse of the cell?");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("Mitochondria")) {
            score++;
        }


        endQuiz(scanner, timer);
    }

    public static void endQuiz(Scanner scanner, Timer timer) {
        timer.cancel(); // Stop the timer
        System.out.println("Quiz Ended!");
        System.out.println("Your score is: " + score);
        scanner.close();
        System.exit(0);
    }
}
