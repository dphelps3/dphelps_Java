
package VowCon;

public class Detector {
    
    private int numVowels;
    private int numCons;
    private char currChar;
    
    public String setString(String value) {
        
        // reset all variables to 0
        numVowels = 0;
        numCons = 0;
                
        for(int i = 0; i < value.length(); i++)
        {
            currChar = value.charAt(i);
            
            if(currChar == 'a' || currChar == 'A' || currChar == 'e' || 
                    currChar == 'E' || currChar == 'i' || currChar == 'I' || 
                    currChar == 'o' || currChar == 'O' || currChar == 'u' || 
                    currChar == 'U') 
                {
                numVowels++;
                }
            
            else 
                {
                numCons++;
                }
            
        }
        
        return value;
    }
    
    public Integer getVowels(){
        return numVowels;
    }
    
    public Integer getCons(){
        return numCons;
    }
    
    public Integer getCombined(){
        return numVowels + numCons;
    }
    
}
