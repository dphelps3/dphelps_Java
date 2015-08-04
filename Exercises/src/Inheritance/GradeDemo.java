
package Inheritance;

// import the Scanner
import java.util.Scanner;

public class GradeDemo {
    
    public static void main(String[] args) {
        
        // variables
        double testScore;
        
        // create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        // create a GradedActivity object
        GradedActivity grade = new GradedActivity();
        
        // get a test score from the user
        System.out.print("Enter a numeric test score: ");
        testScore = keyboard.nextDouble();
        
        // set the graded activity object's score
        grade.setScore(testScore);
        
        // Display the letter grade for that score
        System.out.println("The grade for that test is " + grade.getGrade());
        
    }
    
}
