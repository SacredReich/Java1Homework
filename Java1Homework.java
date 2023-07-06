import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;

public class HomeWork1 {

    public static void main(String[] args) {
        // nTriangle();
        // simpleCount();
        Calc();
    }

    static void nTriangle() {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        System.out.println("Input N:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberN = 0;
        for (int i = 1; i <= number; i++) {
            numberN += i;
        }
        System.out.println(numberN);
        sc.close();
    }

    static void simpleCount() {
        // Вывести все простые числа от 1 до 1000

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime)

                System.out.println(i);
        }

    }

    static void Calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first number: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Input your operation(+-/*): ");
        char action = scanner.next().charAt(0);

        System.out.println("Input your second number: ");
        Double num2 = scanner.nextDouble();
        scanner.close();

        Double rezult = 0.0;

        switch (action) {
            case '+':
                rezult = num1 + num2;
                break;
            case '-':
                rezult = num1 - num2;
                break;
            case '/':
                rezult = num1 / num2;
                break;
            case '*':
                rezult = num1 * num2;
                break;
            default:
                System.out.printf("Your operation is incorrect!");
                return;
        }

        System.out.println(rezult);
        // System.out.printf(num1 + " " + action + " " + num2 + " = " + rezult);

    }

}