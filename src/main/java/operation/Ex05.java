package operation;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int a, b;
        int result;

        // 두 정수를 입력을 받아 각각 a, b 변수에 저장 후
        // 사칙연산 계산 후에 결과 출력하기

        Scanner scan = new Scanner(System.in);

        System.out.print("a 입력: ");
        a = scan.nextInt();
        System.out.print("b 입력: ");
        b = scan.nextInt();
        result = a + b;
        System.out.println("a + b = " + result);

        result = a - b;
        System.out.println("a - b = " + result);

        result = a*b;
        System.out.println("a * b = " + result);

        result = a/b;
        System.out.println("a / b = " + result);



    }
}
