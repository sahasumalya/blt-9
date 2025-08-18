public class MyCalculator<T extends Number> {

    public Object sum(T a, T b) {
        if(a instanceof Integer) {
            int aInt = ((Integer)a).intValue();
            int bInt = ((Integer)b).intValue();
            return aInt + bInt;
        }
        return 0;

    }

    public <E> Object multiply(T num1, E num2) {
        if(num1 instanceof Integer) {
            int aInt = ((Integer)num1).intValue();
            if(num2 instanceof Double) {
                return aInt * (Double) num2 + 1;
            }
            int bInt = ((Integer)num2).intValue();
            return aInt * bInt;
        }
        return 0;
    }

}
