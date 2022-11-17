package condition;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //정수 3개를 입력받아 최대값, 최소값, 평균 구하기
        Scanner scan = new Scanner(System.in);

        int max, min, avg;

        System.out.print("첫번째 수 입력: ");
        int num1 = scan.nextInt();
        System.out.print("두번째 수 입력: ");
        int num2 = scan.nextInt();
        System.out.print("세번째 수 입력: ");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        }else max = num3;

        if(num1 < num2 && num1 < num3){
            min = num1;
        }else if(num2 < num3){
            min = num2;
        }else min = num3;

        avg = (num1 + num2 + num3) / 3;

        System.out.printf("최대값: %d, 최소값: %d, 평균: %d", max, min, avg);
    }

}
