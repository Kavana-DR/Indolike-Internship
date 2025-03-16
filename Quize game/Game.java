Package Quize game;
import java.util.Scanner;
public class Game { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of India?\n(a) New Delhi\n(b) Maharashtra\n(c)Bihar\n(d)Karnataka",
            "Which programming language is used for Android development?\n(a) Python\n(b) Java\n(c) C++\n(d) Swift",
            "What is 5 + 3?\n(a) 6\n(b) 8\n(c) 9\n(d) 7"
        };
        char[] answers = {'c', 'b', 'b'};  

        int score = 0;

        System.out.println("🎯 Welcome to the Quiz Game! 🎯\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer (a/b/c/d): ");
            char userAnswer = scanner.next().charAt(0);

            if (Character.toLowerCase(userAnswer) == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect. The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("🎉 Quiz Over! Your final score: " + score + "/" + questions.length);
        scanner.close();
    }
}

    

