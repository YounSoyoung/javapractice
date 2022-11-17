package condition;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //정수 3개를 입력받아서 작은 수부터 나열시키기
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;
        int temp;

        System.out.print("첫번째 수를 입력: ");
        num1 = scan.nextInt();
        System.out.print("두번째 수를 입력: ");
        num2 = scan.nextInt();
        System.out.print("세번째 수를 입력: ");
        num3 = scan.nextInt();
        //3,2,1
        if(num1 > num2){
            temp = num2;
            num2 = num1;
            num1 = temp;
        }//2.3.1
        if(num1 > num3){
            temp = num3;
            num3 = num1;
            num1 = temp;
        }//1.3.2
        if(num2 > num3){
            temp = num3;
            num3 = num2;
            num2 = temp;
        }
        System.out.printf("작은 수부터 정렬: %d, %d, %d", num1, num2, num3);

        scan.close();
    }
}
