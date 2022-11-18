package loop;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //시작값 끝값 증가값까지 입력받아 합을 구하는 식 만들기
        Scanner scan = new Scanner(System.in);
        System.out.print("시작값 입력: ");
        int start = scan.nextInt();

        System.out.print("끝값 입력: ");
        int end = scan.nextInt();

        System.out.print("증가값 입력: ");
        int plus = scan.nextInt();

        int sum = 0;

        for(int i = start; i <= end; i+=plus){
            sum += i;
        }
        System.out.println(sum);
    }
}
