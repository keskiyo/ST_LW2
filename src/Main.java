public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        calculator.choice();
        int input = (int) calculator.getDoubleInput("Введите номер операции: ");
        double result = calculator.calculate(input);
        System.out.println("Результат: " + result);
    }
}
