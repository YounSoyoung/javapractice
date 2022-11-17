package condition;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //2개의 수를 입력받고 if, else if문을 사용해서
        //몇 번째 입력받은 수가 큰 수인지 확인하기

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 수 입력: ");
        int a = scan.nextInt();
        System.out.print("두번째 수 입력: ");
        int b = scan.nextInt();

        if(a > b){
            System.out.println("첫번째 수가 두번째 수보다 크다");
        } else if (a < b) {
            System.out.println("두번째 수가 첫번째 수보다 크다");
        }else System.out.println("두 수의 크기는 같다.");
    }
}
