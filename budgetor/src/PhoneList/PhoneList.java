
package PhoneList;

public class PhoneList {
    
    // declaring variable
    private String inputtedValue;
    private boolean strContain;
    
    // creating array
    private String[] members = {"HARRISON, ROSE", "JAMES, JEAN", "SMITH, WILLIAM",
        "SMITH, BRAD", "SMART, ROD"};
    
    // creating a parallel array in concordance to members array
    private int[] phoneNbr = {5552131, 7842134, 8291281, 3478853, 6682759};
    
    public String PhoneList(String input){
        inputtedValue = input.toUpperCase();
        
        // cycle through the members array
        for(int x = 0; x < members.length; x++){
            if(members[x].contains(inputtedValue))
            {
                strContain = true;
                
                // if true, then print string with person and info
                if(strContain == true){
                    System.out.println(members[x] + " - " + phoneNbr[x]);
                }
                
            }
        }
        
        // if false, then print a sorry message
        if(strContain == false) {
            System.out.println("Sorry, nothing was found.");
        }
        
        return input;
    }
    
    
}
