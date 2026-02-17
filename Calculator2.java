public class Calculator2<T extends Number> {

    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
