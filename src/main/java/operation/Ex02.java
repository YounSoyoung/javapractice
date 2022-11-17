package operation;

public class Ex02 {
    public static void main(String[] args) {
        int a, b, c, d;

        a = 10;
        b = 20;
        c = 30;
        d = 40;

        int result1 = a + b * c - d;
        System.out.println("10 + 20 * 30 - 40: " + result1);
        //산술연산식에서 덧셈, 뺄셈보다는 곱셈, 나눗셈이 우선처리

        boolean result2 = a < b && c > d;
        System.out.println("10 < 20 && 30 > 40: " + result2);
        //&&보다는 <, >의 우선순위가 높다

        boolean result3 = a > b || c < d;
        System.out.println("10 > 20 || 30 < 40: " + result3);
    }
}
