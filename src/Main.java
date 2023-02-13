public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        fizzbuzz(100);
    }
    public static void fizzbuzz(int x) {
        for (int i = 1; i < x; i++) {

            if ((i % 3 == 0) && (i % 5 ==0)) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}