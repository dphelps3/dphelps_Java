
package lombardo;

public class Copier {
    
    // private variables
    private Reader reader;
    private Writer writer;
    
    /** Get a reader and writer object (interface types). Copying ability
     * is open to any number of implementations that implement those
     * interfaces
     * 
     * Both the dependency inversion principle (DIP) and the Liskov
     * Substitution Principle are highlighted here
     */
    
    public Copier (Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
}
