
package Practice1;

public class StudentResults {
    
    String fullName;
    String examName;
    String examScore;
    String examGrade;
    
    
    public StudentResults()
    {
        fullName = "No Name";
        examName = "unknown";
        examScore = "No Score";
        examGrade = "unknown";
    }
    
    String fullName(String aName)
    {
        fullName = aName;
        return fullName;
    }
}
