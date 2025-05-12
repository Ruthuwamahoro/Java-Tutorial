import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is your name?: ");

        String name = scanner.nextLine();
        System.out.println("Hello " +  name);

        //let's accept only integers
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are " + age + " years old");

        //let's accept only double
        System.out.println("How much do you earn? ");
        double salary = scanner.nextDouble();
        System.out.println("You earn " + salary + " dollars");

        System.out.println("What is your favorite food? ");
        String food = scanner.next();
        System.out.println("Your favorite food is " + food);
    }
}
