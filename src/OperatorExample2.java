public class OperatorExample2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 복합적인 수식
        int result = (++a * b - 15) > (b / 2) && !float ? a + b : b - a;

        System.out.println("Result: " + result);
    }
}