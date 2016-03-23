package inheritance2;

import java.util.Scanner;

public class FinalExamDemo {
    
    public static void main(String[] args) {
        int questions,
            missed;
        
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Get the number of questions on the final exam
        System.out.print("How many questions are on the final exam? ");
        questions = keyboard.nextInt();
        
        // Get the number of questions the student missed
        System.out.print("How many questions did the student miss? ");
        missed = keyboard.nextInt();
        
        // Create a FinalExam object
        FinalExam exam = new FinalExam(questions, missed);
        
        // Display the test results
        System.out.println("Each question counts " + exam.getPointsEach() 
        + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());
    }
    
}
