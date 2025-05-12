public class MyClass<T, V> {
    T obj;

    V obj2;

    MyClass(T ob, V ob2) {
        this.obj = ob;
        this.obj2 = ob2;
    }

    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
        System.out.println("Type of T is " + obj2.getClass().getName());
    }

    
}
