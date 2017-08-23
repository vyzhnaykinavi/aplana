import java.util.Scanner;

public class TestClass {
    static double firstNum = 5;
    static double secondNum = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");
        fistNum = scanner.next.Double();
        System.out.println("Введите второе число");
        fistNum = scanner.next.Double();
        double result = divNumbers(firstNum,secondNum);
        int result1 = addNumbes(firstNum, secondNum);
        int result2 = getNumbres1(firstNum, secondNum);
        int result3 = getNambers2(firstNum, secondNum);
        int result4 = getNumber3(firstNum, secondNum);

        String resultString = String.format("result2 is %s", result1);
        System.out.println(resultString);
        System.out.println("result is " + result1);
        System.out.println("result is " + result2);
        System.out.println("result is " + result3);
        System.out.println("result is " + result4);

    }

    public static int addNumbes(int firstNamber, int secondNamber) {
        return firstNamber + secondNamber;
    }

    public static int getNumbres1(int firstNamber, int secondNamber) {
        return firstNamber * secondNamber;
    }

    public static int getNambers2(int firstNamber, int secondNamber) {
        return firstNamber / secondNamber;
    }

    public static int getNumber3(int firstNamber, int secondNamber) {
        return firstNamber - secondNamber;
    }
}
/* 3