import java.util.Scanner;

// import javax.lang.model.element.VariableElement;

public class Java1Homework {

    public static void main(String[] args) {
        // CastomTriangleNum();
        // simpleNumsUntill1000();
        // Calc();
        secretEquation();
    }

    // ______________________1 СЕМИНАР__________________________

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    static void CastomTriangleNum() {
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

    // Вывести все простые числа от 1 до 1000
    static void simpleNumsUntill1000() {

        for (int i = 2; i <= 1000; i++) {
            boolean simpleNum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simpleNum = false;
                    break;
                }
            }
            if (simpleNum)
                System.out.println(i);
        }
    }

    // Реализовать простой калькулятор
    static void Calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calc: ");
        Double num1 = scanner.nextDouble();
        char action = scanner.next().charAt(0);
        Double num2 = scanner.nextDouble();
        scanner.close();

        Double result = 0.0;

        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.printf("Incorecct operation. Try again!");
        }
        System.out.println(result);
    }

    // Задано уравнение вида a + b = c, a, b, c >= 0. Некоторые цифры могут быть
    // заменены знаком вопроса, например, 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы
    // одно решение или сообщить, что его нет.
    static void secretEquation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input equation");
        String input = scan.nextLine();
        scan.close();

        String a = "";
        String b = "";
        String c = "";

        char[] equation = input.toCharArray();
        int index = 0;
        for (int i = 0; i < equation.length; i++) {
            if (equation[i] == '+') {
                index = i;
                for (int j = 0; j < i; j++) {
                    a += equation[j];
                }
                break;
            }
        }
        for (int ii = index + 1; ii < equation.length; ii++) {
            if (equation[ii] == '=') {
                for (int j = index + 1; j < ii; j++) {
                    b += equation[j];
                }
                index = ii;
                break;
            }
        }
        for (int iii = index + 1; iii < equation.length; iii++) {
            c += equation[iii];
        }
        int ax = -1;
        int bx = -1;
        int cx = -1;
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        char[] cArray = c.toCharArray();
        for (int i1 = 0; i1 < aArray.length; i1++) {
            if (aArray[i1] == '?') {
                aArray[i1] = '0';
                ax = i1;
                break;
            }
        }
        for (int i2 = 0; i2 < bArray.length; i2++) {
            if (bArray[i2] == '?') {
                bArray[i2] = '0';
                bx = i2++;
                break;
            }
        }
        for (int i3 = 0; i3 < cArray.length; i3++) {
            if (cArray[i3] == '?') {
                cArray[i3] = '0';
                cx = i3++;
                break;
            }
        }
        String aa = new String(aArray);
        String bb = new String(bArray);
        String cc = new String(cArray);
        int aaa = Integer.parseInt(aa);
        int bbb = Integer.parseInt(bb);
        int ccc = Integer.parseInt(cc);

        if (ax == bx) {
            System.out.println("Bad equation!");
        } else if (ax >= 0 & bx >= 0 & cx < 0) {
            int calc = ccc - aaa - bbb;
            char[] arrayCalc = Integer.toString(calc).toCharArray();
            aArray[ax] = arrayCalc[ax];
            bArray[bx] = arrayCalc[bx];

            String aaaa = new String(aArray);
            String bbbb = new String(bArray);
            String cccc = new String(cArray);
            System.out.println("Done!");
            System.out.printf("%s+%s=%s", aaaa, bbbb, cccc);
        } else if (ax >= 0 & bx < 0 & cx < 0) {
            int calc = ccc - aaa - bbb;
            char[] arrayCalc = Integer.toString(calc).toCharArray();
            aArray[ax] = arrayCalc[0];
            String aaaa = new String(aArray);
            String bbbb = new String(bArray);
            String cccc = new String(cArray);
            System.out.println("Done!");
            System.out.printf("%s+%s=%s", aaaa, bbbb, cccc);
        } else if (ax < 0 & bx >= 0 & cx < 0) {
            int calc = ccc - aaa - bbb;
            char[] arrayCalc = Integer.toString(calc).toCharArray();
            aArray[bx] = arrayCalc[0];
            String aaaa = new String(aArray);
            String bbbb = new String(bArray);
            String cccc = new String(cArray);
            System.out.println("Done!");
            System.out.printf("%s+%s=%s", aaaa, bbbb, cccc);
        } else if (ax < 0 & bx < 0 & cx >= 0) {
            int calc = aaa + bbb;
            System.out.printf("%s+%s=%s", aaa, bbb, calc);
        } else if (ax >= 0 & bx < 0 & cx < 0) {
            int calc = ccc - aaa - bbb;
            char[] arrayCalc = Integer.toString(calc).toCharArray();
            aArray[ax] = arrayCalc[ax];
            bArray[bx] = arrayCalc[bx];

            String aaaa = new String(aArray);
            String bbbb = new String(bArray);
            String cccc = new String(cArray);
            System.out.println("Done!");
            System.out.printf("%s+%s=%s", aaaa, bbbb, cccc);
        } else
            System.out.println("Bad equation!");

    }
}