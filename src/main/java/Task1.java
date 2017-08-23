import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число х:");
        double x = Double.parseDouble(reader.readLine());
        System.out.println("Введите число y:");
        double y = Double.parseDouble(reader.readLine());

        System.out.println("Результат: " + f(x, y));

    }

    private static double f(double x, double y) {
        return 3 * (x + 2 * x - y) / (2 * x);
    }
}
