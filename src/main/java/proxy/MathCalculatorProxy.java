package proxy;

public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public Double add(double num1, double num2) {
        if (num1 / 2 + num2 / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (num1 / 2 + num2 / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.add(num1,num2);
    }

    @Override
    public Double sub(double num1, double num2) {
        if (num1 / 2 - num2 / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (num1 / 2 - num2 / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.sub(num1, num2);
    }

    @Override
    public Double mul(double num1, double num2) {
        if (num1 / 2 * num2 / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (num1 / 2 * num2 / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.mul(num1,num2);
    }

    @Override
    public Double div(Double num1, double num2) {
        if (num1 / 2 / num2 / 2 >= Double.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        if (num1 / 2 / num2 / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.div(num1,num2);
    }
}
