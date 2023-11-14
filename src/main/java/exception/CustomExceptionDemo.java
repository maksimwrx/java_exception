package exception;

// Класс-исключение
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

// Класс для демонстрации работы исключения
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            processSomething(48);
        } catch (MyCustomException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }

        try {
            processSomething(90);
        } catch (MyCustomException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    // Метод, который может бросать исключение
    public static void processSomething(int value) throws MyCustomException {
        if (value < 14) {
            throw new MyCustomException("Значение должно быть больше или равно 7");
        } else {
            System.out.println("Обработка значения: " + value);
        }
    }
}

