package input;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자열을 입력: ");

        String str = scan.next();
        // 문자열: next()
        // 공백 전까지 문자열을 읽어온다.
        System.out.println(str);

        System.out.print("정수를 입력: ");
        int a = scan.nextInt();
        //정수: nextInt()
        //공백 전까지 정수를 읽어온다.
        System.out.println(a);

        System.out.print("실수를 입력: ");
        double b = scan.nextDouble();
        //실수: nextFloat() or nextDouble()
        //공백 전까지 실수를 읽어온다.
        System.out.println(b);

        scan.nextLine(); //엔터값 처리
        System.out.print("문자열을 입력: ");
        String str2 = scan.nextLine();
        //문자열: nextLine()
        //라인전체(공백포함) 데이터를 읽어온다
        //주의: next()나 nextInt() 등을 쓰고 nextLine을 쓸 경우
        //남아있는 엔터를 처리하기 때문에 남아있는 엔터를 처리해주어야 한다.
        System.out.println(str2);

        scan.close();
    }
}
