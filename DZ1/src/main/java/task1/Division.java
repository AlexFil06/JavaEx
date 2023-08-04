package task1;
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением
//"Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        try {
            int result = divide(a, b);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }
}

    class DivisionByZeroException extends RuntimeException {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
