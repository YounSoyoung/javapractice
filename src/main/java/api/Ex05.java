package api;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int a = Math.abs(-10);
        //인자로 넘긴 데이터의 절대값을 반환
        System.out.println(a);

        int b = Math.max(1, 9);
        //전달된 데이터 중 더 큰 수를 반환
        System.out.println(b);

        int c = Math.min(1, 9);
        //전달된 데이터 중 더 작은 수를 반환
        System.out.println(c);

        double d = Math.random();
        //0.0 ~ 1.0 미만의 임의의 double 타입의 수 하나를 반환
        System.out.println(d);

        double e = Math.ceil(1.1);
        //전달된 데이터를 올림하여 반환
        System.out.println(e);

        double f = Math.floor(9.9);
        //전달된 데이터를 버림하여 반환
        System.out.println(f);

        long g = Math.round(5.3);
        long h = Math.round(5.7);
        //전달된 데이터를 반올림하여 반환
        System.out.println(g);
        System.out.println(h);

        //Math 클래스를 사용해서 Scanner로 3개의 수를 입력받아
        //최대값 최소값 구하기

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 수를 입력: ");
        int n1 = scan.nextInt();
        System.out.print("두번째 수를 입력: ");
        int n2 = scan.nextInt();
        System.out.print("세번째 수를 입력: ");
        int n3 = scan.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        System.out.println("최대값: " + Math.max(n3, max));
        System.out.println("최소값: " + Math.min(min, n3));
    }
}
