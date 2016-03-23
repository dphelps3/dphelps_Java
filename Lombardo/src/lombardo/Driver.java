
package lombardo;

public class Driver {
    
    public static void main(String[] args) {
        
        // Reader reader = new FileReader();
        // Writer writer = new GuiWriter();
        
        // Reader reader = new FileReader();
        Reader reader = new KeyboardReader();
        Writer writer = new ConsoleWriter();
        
        Copier copier = new Copier(reader,writer);
        copier.copy();
        
        System.out.println("Program ended. Line of reader input copied"
                + " successfully.");
        
    }
    
}
