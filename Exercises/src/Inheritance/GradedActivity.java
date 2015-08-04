
package Inheritance;

public class GradedActivity {

    private double score; // holds the score
    
    // the setScore method stores its argument in the score field
    public void setScore(double s)
    {
        score = s;
    }
    
    // the getScore method returns the score field
    public double getScore()
    {
        return score;
    }
    
    // the getGrade method returns a letter grade
    public char getGrade()
    {
        char letterGrade;
            if (score >= 90)
                letterGrade = 'A';
            else if (score >= 80)
                letterGrade = 'B';
            else if (score >= 70)
                letterGrade = 'C';
            else if (score >= 60)
                letterGrade = 'D';
            else
                letterGrade = 'F';
            
        return letterGrade;
    }
}
