public class SwitchStament {
    public static void main(String[] args) {
        // switch statement = executes a block of code depending on different cases
        // break = breaks out of the switch block
        // default = code that runs if no case is true
        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
