import java.util.Scanner;
public class DoLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's conditions evaluates to true
        Scanner input = new Scanner(System.in);
        String name= "";
        do {
            System.out.println("What is your name?: ");
            name = input.nextLine();
        } while(name.isEmpty());
        
        System.out.println("Hello " + name);
        
    }
}

