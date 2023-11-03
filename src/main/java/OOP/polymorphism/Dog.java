package OOP.polymorphism;

public class Dog extends Animal {
    public String animalType(){
        return "Dog is a domestic animal "+super.animalType();
    }

    public static void main(String[] args) {
        System.out.println(new Dog().animalType());
    }
}
