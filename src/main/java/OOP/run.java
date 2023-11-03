package OOP;


public class run {

    public static void staticMethod(){

    }

    public static void normalMethod(){

    }

    public static void main(String[] args) {
      normalMethod();

      staticMethod();







        Dog dog1 = new Dog();
        dog1.setName("Bingo");
        dog1.setBreed("Local Dog");
        dog1.setAge(5);

        Dog dog2 = new Dog();
        dog2.setName("Jack");
        dog2.setBreed("German Shepherd");
        dog2.setAge(7);

        System.out.println("The name of the first dog is "
                +dog1.getName()+", he is a "
                +dog1.getBreed()+" and he is "
                +dog1.getAge()+" Months old.");

        System.out.println("The name of the second dog is "
                +dog2.getName()+", he is a "
                +dog2.getBreed()+" and he is "
                +dog2.getAge()+" Months old.");

    }
}
