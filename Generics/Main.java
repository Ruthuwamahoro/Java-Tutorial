public class Main {
    public static void main(String[] args) {

        // what is passed here needs to be object type not primitive

        MyClass<Integer, Double> obj1 = new MyClass<>(10, 20.5);
        // MyClass<Double> obj2 = new MyClass<>(20.5);
        obj1.showType();
        // obj2.showType();
    }
}
