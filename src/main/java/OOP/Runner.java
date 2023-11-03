package OOP;

public class Runner {
    public static void main(String[] args) {

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();

   //dog1
    dog1.setName("Romeo");
    dog1.setBreed("Shittu");
    dog1.setAge(4);

    //dog2
        dog2.setName("Joe");
        dog2.setBreed("Chiuaua");
        dog2.setAge(2);
    //dog3
        dog3.setName("Jack");
        dog3.setBreed("Bulldog");
        dog3.setAge(6);

        System.out.println("The first dog's name is "+dog1.getName()+",  He is a "+
                dog1.getBreed()+" and he is "+dog1.getAge()+" Months old.");

    }
}
