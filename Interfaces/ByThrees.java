
// we could extends classes as well as implements it at the same time
public class ByThrees implements Series, Series2{
    // we have to implement the getNext method(all methods defined in Interface) from series otherwise we will get an error

    int val;

    ByThrees() {
        val = 0;
    }

    public void message() {
        System.out.println("This is a message from Series2");
    }

    public int getNext(){
        val += 3;
        return val;
    }
    
}
