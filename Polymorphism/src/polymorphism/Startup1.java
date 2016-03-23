package polymorphism;

public class Startup1 {

    public static void main(String[] args) {

        Object[] animals = new Object[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).bark();
            } else if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).meow();
            }
        }

    }

}
