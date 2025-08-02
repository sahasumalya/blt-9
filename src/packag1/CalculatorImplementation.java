package packag1;

public class CalculatorImplementation implements CalculatorInterface{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }



    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }
}
