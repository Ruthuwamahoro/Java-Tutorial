public class PrintHelloWorld {
    /* t must be public to be accessible to the java runtime
    it must be static to be accessible without creating an instance of the class
    it must be void because it does not return any value
    it must be main because it is the entry point of the program
    it must take a String array as an argument because it is the standard signature for the main method
    it must be String[] because it is the standard signature for the main method
    it must be args because it is the standard name for the argument */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("hello world");
        System.out.printf("hello world");
        System.out.format("hello world");
    }
}
