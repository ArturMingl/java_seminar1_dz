package java_tasks.Seminar1dz;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * а так же n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangular_number(i));
        System.out.printf("Факториал числа: %d\n", factorial(i));
        iScanner.close();
    }

    public static int triangular_number(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factorial(int a) {
        if (a <= 2) {
            return a;
        }
        return a * factorial(a - 1);
    }
}
