
package Exercises;

// import StringTokenizer class
import java.util.StringTokenizer;

public class EmailComponent {
    
    private String user,
                    company,
                    domain;
    
    public EmailComponent(String emailStr) {
        
        // create a StringTokenizer object
        
        StringTokenizer strTokenizer = new StringTokenizer(emailStr, "@.");
        
        // get the first token
        user = strTokenizer.nextToken();
        
        // get the second token
        company = strTokenizer.nextToken();
        
        // get the third token
        domain = strTokenizer.nextToken();
                
    }
    
    // return the month field
    public String getUser()
    {
        return user;
    }
    
    // return the day field
    public String getCompany()
    {
        return company;
    }
    
    // return the year field
    public String getDomain()
    {
        return domain;
    }
    
}
