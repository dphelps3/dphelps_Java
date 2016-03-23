
package CheckWriter;

public class CheckWriter {
    
    private String moneyString;
    private String result;
    private char currChar;
    
    public String CheckBook(String userValue){
        moneyString = userValue;
        
        // convert moneyString value into double format
        double moneyDouble = Double.valueOf(moneyString);
        
        // if money value is too high
        if (moneyDouble > 2000.00) {
            result = "Sorry, we cannot work with currency over $2,000.00";
        } else if (moneyDouble == 2000.00) {
            result = "Two-thousand and 00 cents";
        } else if (moneyDouble >= 1000.00) {
            // for loop to cycle through all the digits
            for (int i = 0; i < moneyString.length(); i++){
                currChar = moneyString.charAt(i);
                
            }
        }
        
        
        
        return userValue;
    }
    
}
