import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.println("1 Отсортировать массив произвольных чисел по убыванию и вывести его в одну строку через пробел\n" +
                "2 Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести сумму этих 2-х элементов на экран\n" +
                "3 Найти в массиве число, которое повторяется наибольшее количество раз.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random(System.currentTimeMillis());
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.print("Исходный массив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }
        System.out.println();
        while (true) {
            System.out.print("Введите номер задания (1, 2 или 3): ");
            String command = reader.readLine();
            if (command.equals("1")) {
                sort(arr);
                continue;
            }
            if (command.equals("2")) {
                sumMinMax(arr);
                continue;
            }
            if (command.equals("3")) {
                maxCount(arr);
                continue;
            }
            if (command.equals("q")) {
                break;
            }
            System.out.println("Такого задания не существует");
        }
    }

    private static void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    private static void sumMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Сумма максимально иминимального элементов = " + (min + max));
    }

    private static void maxCount(int[] arr) {
        int maxCnt = 0;
        int maxVal = 0;
        for (int searchVal : arr) {
            int cnt = 0;
            for (int val : arr) {
                if (searchVal == val) {
                    cnt++;
                }
            }
            if (cnt > maxCnt) {
                maxCnt = cnt;
                maxVal = searchVal;
            }
        }
        System.out.println(maxVal + " повторяется наибольшее количество раз");
    }
}
