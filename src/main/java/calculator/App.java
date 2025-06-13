package calculator;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("4 + 5 = " + calc.add(4, 5));
        System.out.println("6 / 2 = " + calc.divide(6, 2));
    }
}
