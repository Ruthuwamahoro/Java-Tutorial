//it is possible to extends interfaces

public interface Series {
    int MAX = 10;

    String ERRORMSG = "Cannot go above the value "+ MAX;
    int getNext();

    default void printStuff(){
        System.out.println("Live from New York.It's saturday night.");
        PrintMoreStuff();
    }

    private void PrintMoreStuff(){
        System.out.println("More stuff.");
    }
}
