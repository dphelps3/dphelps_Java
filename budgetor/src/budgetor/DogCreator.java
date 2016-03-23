
package budgetor;

public class DogCreator {
    
    public static void main(String[] args) {
        
        // this creates an object (instantiation)
        Dog dog1 = new Dog();
        
        dog1.setLegs(4);
        dog1.setTail(true);
        dog1.setHair("Curly");
        
        // output all the results
        System.out.println("This dog has " + dog1.getLegs() + " legs.");
        System.out.println("Does this dog have a tail?: " + dog1.getTail());
        System.out.println("This dog has " + dog1.getHair() + " hair.");
        
    }
    
}
