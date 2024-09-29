Lab 2 
Name: Aryankumar Chaudhari;
301430998;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Test.inputAnswer();


        for (int i = 0; i < Test.questions.size(); i++) {
            Test.simulateQuestion(i);
            boolean isCorrect = Test.checkAnswer(i);
            Test.generateMessage(isCorrect);
        }
    }
}

class Test {

    // List to store questions
    public static List<String> questions = new ArrayList<>();
    // List to store correct answers
    public static List<String> correctAnswer = new ArrayList<>();
    // List to store user answers
    public static List<String> userAnswers = new ArrayList<>();

    // Method called simulateQuestion to ask one question at a time
    public static void simulateQuestion(int questionNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(questions.get(questionNumber)); // displaying questions
        System.out.print("Your Answer: ");
        String answer = scanner.nextLine();
        userAnswers.add(answer);  // Store the user's answer
    }

    // Method to check the user's answer for a specific question
    public static boolean checkAnswer(int questionNumber) {
        String correctAns = correctAnswer.get(questionNumber);
        String userAns = userAnswers.get(questionNumber);
        return userAns.equals(correctAns);  // case-sensitive
    }

    // Method to generate a random message based on whether the answer is correct or not
    public static void generateMessage(boolean isCorrect) {
        String[] correctMessages = {"Well done!", "Great job!", "You got it right!"};
        String[] incorrectMessages = {"Oops, that's not correct.", "Try again next time.", "Incorrect, but keep trying!"};

        Random rand = new Random();
        if (isCorrect) {
            int randomIndex = rand.nextInt(correctMessages.length);
            System.out.println(correctMessages[randomIndex]);
        } else {
            int randomIndex = rand.nextInt(incorrectMessages.length);
            System.out.println(incorrectMessages[randomIndex]);
        }
    }

    // Method to input correct answers and questions to the lists
    public static void inputAnswer() {
        // Adding questions
        questions.add("Question 1: In which continent is Canada situated?");
        questions.add("Question 2: Where is Centennial College's main campus?");
        questions.add("Question 3: What are Centennial College athletes called?");

        // Adding corresponding correct answers
        correctAnswer.add("North America");
        correctAnswer.add("Scarborough");
        correctAnswer.add("Colts");
    }
}
