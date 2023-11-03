package OOP.polymorphism;



public class Runner {
    public static void main(String[] args) {

        Dog dog  = new Dog();
        System.out.println(dog.animalType());

        Cat cat = new Cat();
        System.out.println(cat.animalType());

        Animal animal = new Animal();
        System.out.println(animal.animalType());
    }
}
