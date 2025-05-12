
public class NumericFn<T extends Number> {
    T num;

    public NumericFn(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.doubleValue();
    }
    
}
