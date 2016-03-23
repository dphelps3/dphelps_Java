
package Inheritance;

import java.util.Scanner;

public class CurvedActivityDemo {
    
    public static void main(String[] args) {
        
        // declare variables
        double score,
                curvePercent;
        
        // create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // get the unadjusted exam score
        System.out.print("Enter the student's raw numeric score: ");
        score = keyboard.nextDouble();
        
        // get the curve percentage
        System.out.print("Enter the curve percentage ");
        curvePercent = keyboard.nextDouble();
        
        // create a CurvedActivity object
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);
        
        // set the exam score
        curvedExam.setScore(score);
        
        // display the test results
        System.out.println("The raw score is " + curvedExam.getRawScore() 
        + " points.");
        System.out.println("The curved score is " + curvedExam.getScore());
        System.out.println("The exam grade is " + curvedExam.getGrade());
        
    }
    
}
