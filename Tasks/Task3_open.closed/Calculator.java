abstract class Calculate {
    public abstract double cal(double num1, double num2);
}

class Add extends Calculate {
    @Override
    public double cal(double num1, double num2) {
        return num1 + num2;
    }
}

class Sub extends Calculate {
    @Override
    public double cal(double num1, double num2) {
        return num1 - num2;
    }
}


public class Calculator {
    public static void main(String[] args) {
        Add additionCalculator = new Add();
        System.out.println("Addition result: " + additionCalculator.cal(5, 3));

        Sub subtractionCalculator = new Sub();
        System.out.println("Subtraction result: " + subtractionCalculator.cal(10, 3));
    }
}