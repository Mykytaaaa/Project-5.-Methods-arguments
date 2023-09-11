public class Part1 {
    public static void main(String[] args) {
        print(method4());
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static String method4() {
        return "The number is " + sum(1, 2) + "; even: " + isEven(sum(1, 2));
    }
}
