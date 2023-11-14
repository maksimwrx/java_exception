package exception;

public class Second {

    public static void main(String[] args) {
        // todo write demo

        try {
            divideByZero(5.0);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e);
        }

        try {
            checkPositiveNumber(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение перехвачено: " + e);
        }

        try {
            manipulateString(null);
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
    }

    public static void divideByZero(double number) {
        if (number == 0.0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double result = 10 / number;
        System.out.println("Результат деления: " + result);
    }

    public static void checkPositiveNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        System.out.println("Число положительное: " + number);
    }

    public static void manipulateString(String text) {
        if (text.length() < 5) {
            throw new NullPointerException("Слишком короткая строка");
        }
        System.out.println("Длина строки: " + text.length());
    }

}
