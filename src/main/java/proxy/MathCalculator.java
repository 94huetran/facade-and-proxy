package proxy;

public class MathCalculator implements Calculator {
    @Override
    public Double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public Double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public Double mul(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public Double div(Double num1, double num2) {
        return num1 / num2;
    }
}
