
import java.util.Scanner;




public class WhileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's conditions evaluates to true
        Scanner input = new Scanner(System.in);
        String name= "";
        while(name.isEmpty()){
            System.out.println("What is your name?: ");
            name = input.nextLine();
            if(name.isBlank()){
                System.out.println("Please enter a valid name");
            }
        }
        System.out.println("Hello " + name);
        
    }
}

