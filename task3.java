package java_tasks.Seminar1dz;

import java.util.Scanner;

/**
 * Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

public class task3 {


    static int getResult(char opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите превое число: ");
        int num1 = reader.nextInt();
        System.out.println("Введите оператор: -, +, *, /");
        char operations = reader.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = reader.nextInt();
        reader.close();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
    }
}
