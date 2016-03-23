
package myInterface;

public class Startup1 {
    
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();
        
        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
        
        for (Animal a : animals) {
            a.speak();
        }
    }
    
}
