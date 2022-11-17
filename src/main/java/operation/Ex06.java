package operation;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //정수(돈)을 입력받아 동전교환하기

        Scanner scan = new Scanner(System.in);

        int money, c500, c100, c50, c10;

        System.out.println("동전으로 교환할 돈 입력: ");
        money = scan.nextInt();

        //1980 >> 500원 3개, 100원 4개, 50원 1개, 10월 3개
        //입력받은 돈을 각각의 동전 변수에 몇 개를 교환했는지 갯수를 저장한 후에
        // 각각의 동전을 출력하기
        c500 = money / 500;
        money = money % 500;

        c100 = money / 100;
        money = money % 100;

        c50 = money / 50;
        money = money % 50;

        c10 = money / 10;
        money = money % 10;

        System.out.println("500원 동전: " + c500 + "개");
        System.out.println("100원 동전: " + c100 + "개");
        System.out.println("50원 동전: " + c50 + "개");
        System.out.println("10원 동전: " + c10 + "개");
        System.out.println("바꾸지 못한 잔돈: " + money + "원");

        scan.close();

    }
}
