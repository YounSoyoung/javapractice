package condition;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 정수 하나를 입력받아 그 정수가 홀수인지 짝수인지 확인하기
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int a = scan.nextInt();

        if(a % 2 == 0){
            System.out.println("입력하신 정수는 짝수입니다.");
        }else System.out.println("입력하신 정수는 홀수입니다.");

    }
}
