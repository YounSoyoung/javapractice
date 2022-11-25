package array;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        //배열과 for문을 사용해서 5명의 자바 점수를 입력받아
        //각 학생의 자바 점수를 출력하고
        //총 자바점수의 합과 평균 구하기

        Scanner scan = new Scanner(System.in);

        int[] java = new int[5];
        int sum = 0;

        //입력받기
        for(int i=0; i<5; i++){
            System.out.println(i+1 + "번째 점수 입력: ");
            java[i] = scan.nextInt();
            sum += java[i];
        }

        //출력하기
        for(int i=0; i<5; i++){
            System.out.println(i+1 + "번째 점수: " + java[i]);
        }

        System.out.println("5명 점수의 합은: " + sum);

        int avg = sum/5;
        System.out.println("5명 점수의 평균은: " + avg);

        scan.close();
    }
}
