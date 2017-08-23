public class Task2 {
    public static void main(String[] args) {
        String string = "Я хороший разработчик автотестов";
        System.out.println(replace(string));
        System.out.println(substring(string));
    }

    private static String replace(String str) {
        return str.replace("хороший", "отличный");
    }

    private static String substring(String str) {
        return replace(str).substring(11, 22);
    }
}
