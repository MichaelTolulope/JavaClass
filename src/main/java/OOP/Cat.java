package OOP;

public class Cat {
    public int add(int x, int y){
        return x+y;
    }

    public String add(String Firstname, String Lastname){
        return Firstname+" "+ Lastname;
    }
    public static void main(String[] args) {
        Cat obj = new Cat();
        System.out.println(obj.add(2,7));

        System.out.println(new Cat().add("Michael", "Tolu"));
    }

}
