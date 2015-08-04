
package Inheritance;

public class FinalExam extends GradedActivity {
    
    // private variables
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    /* the constructor accepts as arguments the number
    of questions on the exam and the number of questions
    the student missed.
    */
    public FinalExam(int questions, int missed)
    {
        double numericScore;
        
        // Set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;
        
        // Calculate the points for each question
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        
        /* call the superclass's setScore method
        to set the numeric score
        */
        setScore(numericScore);
    }
    
    /* the getPointsEach method returns the pointsEach field
    */
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    // the getNumMissed method returns the numMissed field
    public int getNumMissed()
    {
        return numMissed;
    }
}
