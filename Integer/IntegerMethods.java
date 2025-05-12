package Integer;
import java.util.Random;


public class IntegerMethods {
    public static void main(String[] args){

        //create instance of the class
        Random random = new  Random();
        
        //give value between 0 and 6
        int x = random.nextInt(6)+1;

        //give value between Zero and one
        double y = random.nextDouble();

        //generate random boolean value
        boolean z = random.nextBoolean();

        //change integer into string
        String value = Integer.toString(x);
        System.out.println(value);

        //to check type of value
        System.out.println(value instanceof String);
        
    }
}
