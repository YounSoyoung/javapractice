package condition;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //정수 하나를 입력받아 3의 배수인지 5의 배수인지 알아보기
        //1. 3과 5의 배수
        //2. 3의 배수
        //3. 5의 배수
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int a = scan.nextInt();

        if(a % 3 == 0 && a % 5 ==0){
            System.out.println("3과 5의 배수이다.");
        }else if(a % 3 == 0){
            System.out.println("3의 배수이다.");
        }else if(a % 5 == 0){
            System.out.println("5의 배수이다.");
        }else System.out.println("3과 5의 배수가 아니다.");
    }
}
