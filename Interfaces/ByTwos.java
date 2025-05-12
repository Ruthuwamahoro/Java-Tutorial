
// we could extends classes as well as implements it at the same time
public class ByTwos implements Series, Series2{
    // we have to implement the getNext method(all methods defined in Interface) from series otherwise we will get an error

    int val;

    ByTwos() {
        val = 0;
    }

    public void message() {
        System.out.println("This is a message from Series2");
    }

    // max is not defened anywhere in this class but we have access to it from the interface

    public int getNext(){
        if(val >= MAX){
            System.out.println(ERRORMSG);
        }else {
            val += 2;
        }
        return val;
    }

    // I can overide the method printStuff defined in interfaces

    // public void printStuff(){
    //     System.out.println("I am ByTwos class.");
    // }
    
}
