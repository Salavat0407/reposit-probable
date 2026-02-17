public class Main {
    public static void main(String[] args){
        Box2<Integer> b1 = new Box2<>(100);
        Box2<Double> b2 = new Box2<>(92.5);
        System.out.println(b1.getClass() == b2.getClass());
        Box2<Integer> box = new Box2<>(200);
        Integer newInt = box.createNew(999);
        System.out.println(newInt);

        Calculator2<Integer> intCalc = new Calculator2<>();
        System.out.println("5 + 3 = " + intCalc.add(5, 3));
        System.out.println("5 / 2 = " + intCalc.divide(5, 2));

        Calculator2<Double> doubleCalc = new Calculator2<>();
        System.out.println("5.5 + 2.2 = " + doubleCalc.add(5.5, 2.2));
        System.out.println("5.5 * 2 = " + doubleCalc.multiply(5.5, 2.0));

        Calculator2<Fraction2> fractionCalc = new Calculator2<>();
        Fraction2 fr1 = new Fraction2(2,15);
        Fraction2 fr2 = new Fraction2(3,15);
        System.out.println("2/15 + 3/15 = " + fractionCalc.add(fr1, fr2));

    }
}
