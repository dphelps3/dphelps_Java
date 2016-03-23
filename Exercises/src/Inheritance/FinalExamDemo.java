
package Inheritance;

import java.util.Scanner;

public class FinalExamDemo {
    
    public static void main(String[] args) {
        
        // declaring the variables
        int questions;
        int missed;
        
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // get the number of questions on the final exam
        System.out.print("How many questions are on the final exam? ");
        questions = keyboard.nextInt();
        
        // Get the number of questions the student missed
        System.out.print("How many questions did the student miss? ");
        missed = keyboard.nextInt();
        
        // create a FinalExam object
        FinalExam exam = new FinalExam(questions, missed);
        
        // display the test results
        System.out.println("Each question counts " + exam.getPointsEach() +
                " points.");
        
        System.out.println("The exam score is " + exam.getScore());
        
        System.out.println("The exam grade is " + exam.getGrade());
                
    }
    
}
