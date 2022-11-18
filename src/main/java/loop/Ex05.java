package loop;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //for문을 사용해서 숫자 5번 입력받기

        Scanner scan = new Scanner(System.in);

        int su = 0;
        int hap = 0;

        for(int i=1; i <= 5; i++){
            System.out.print(i+"번째 정수를 입력: ");
            su = scan.nextInt();
            hap += su;
            System.out.println(i+"번째 정수의 합계; " + hap);
        }
        scan.close();
    }
}
