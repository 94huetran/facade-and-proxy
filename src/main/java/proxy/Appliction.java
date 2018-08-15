package proxy;

public class Appliction {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(3, 5);
        System.out.println(result);
        result = proxy.add(4, Double.MAX_VALUE);
        System.out.println(result);
    }

}
