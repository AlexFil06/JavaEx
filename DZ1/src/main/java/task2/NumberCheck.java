package task2;

import java.util.Scanner;
//Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
//Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
//Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
//Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
//- необходимо создать 3 класса собвстенных исключений
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        try {
            checkNumbers(a, b, c);
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumbers(int a, int b, int c) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (a > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a + b < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}

