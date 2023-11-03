package OOP;

public class Dog{
private String name;
private String breed;
private int age;


public Dog(){

}

public Dog(String name, String breed, int age){
   this.name = name;
   this.breed = breed;
   this.age = age;

      System.out.println(name);
    System.out.println(breed);
    System.out.println(age+" months old");


}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age_in_months) {
        this.age = age_in_months;
    }
}