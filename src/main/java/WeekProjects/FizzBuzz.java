package WeekProjects;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int x=1; x<=15; x++){
            if (x%3 == 0 && x%5!=0) {
                System.out.println("Fizz!");
            } else if (x%5 == 0 && x%3!=0) {
                System.out.println("Buzz!");
            } else if (x%3 == 0 && x%5 == 0) {
                System.out.println("Fizz Buzz!!");
            }else{
                System.out.println(x);
            }
        }
    }
}
