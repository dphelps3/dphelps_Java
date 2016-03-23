
package budgetor;

public class VirtualDemo {
    
    public static void main(String[] args) {
        
        Salary s = new Salary("Tim Cook", "Los Angeles, CA", 3, 5400000.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 240000.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
    
}
