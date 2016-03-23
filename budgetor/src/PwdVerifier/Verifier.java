
package PwdVerifier;

public class Verifier {
    char currChar;
        String result;
        boolean sixChar = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean lowerUpper = false;
        boolean oneDigit = false;
        
        // array for holding error values
        String[] errors = new String[3];
        
    public String setPassword(String input){
        
        // verify if the password string is at least 6 characters long
        if (input.length() >= 6){
            sixChar = true;
        } else {
            sixChar = false;
            errors[0] = "The password needs to be at least 6 characters long!";
        }
        
        // scan the string for uppercase letters
        for (int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))) {
                upperCase = true;
            }
        }
        
        // scan the string for lowercase letters
        for (int j = 0; j < input.length(); j ++){
            if(Character.isLowerCase(input.charAt(j))) {
                lowerCase = true;
            }
        }
        
        // combine lowerCase and upperCase together
        if (upperCase == true && lowerCase == true) {
            lowerUpper = true;
        } else {
            lowerUpper = false;
            errors[1] = "The password needs to have at least one uppercase"
                    + " and one lowercase letter!";
        }
        
        // check for numerical values
        for(int x = 0; x < input.length(); x++)
        {
            currChar = input.charAt(x);
            
            if(currChar == '1' || currChar == '2' || currChar == '3' || 
                    currChar == '4' || currChar == '5' || currChar == '6' || 
                    currChar == '7' || currChar == '8' || currChar == '9' || 
                    currChar == '0') {
                // System.out.println("Number is at " + currChar + " position.");
                oneDigit = true;
            } else {
                oneDigit = false;
               errors[2] = "Your password must contain at least one number!";
            }
        }
        
        if (oneDigit == true && lowerUpper == true && sixChar == true) {
            result = "Password Approved!";
        } else {
            result = "Password Not Valid.";
        }
        
        return input;
    }
    
    public String getResult(){
        if (result == "Password Not Valid."){
            // for loop to cycle through errors
            for (int z = 0; z < 2; z++){
                if(errors[z] != null && !errors[z].isEmpty()){
                    System.out.println(errors[z]);
                }
            }
            return result;
        } else {
        return result;
        }
    }
    
}
    
   
    
