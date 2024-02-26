package t2;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        validateDivisionByZero(b);
        return a / b;
    }

    private void validateDivisionByZero(int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
