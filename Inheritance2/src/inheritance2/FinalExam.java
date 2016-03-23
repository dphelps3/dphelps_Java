package inheritance2;

public class FinalExam extends GradedActivity {
    
    private int numQuestions; // holds number of questions
    private double pointsEach; // points for each question
    private int numMissed; // number of questions missed
    
    /* The constructor accepts as arguments the number of
    questions on the exam and the number of questions the
    student missed.
    */
    
    // the constructor
    public FinalExam(int questions, int missed)
    {
        double numericScore; // To calculate the numeric score
        
        // set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;
        
        /* Calculate the points for each question and the
        numeric score for this exam */
        
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        
        /* call the superclass' setScore method to set
        the numeric score
        */
        
        setScore(numericScore);
    }
    
    /* the getPointsEach method returns the pointsEach field */
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    // numMissed field
    public int getNumMissed()
    {
        return numMissed;
    }
    
}
