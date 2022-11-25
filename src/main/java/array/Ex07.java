package array;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //배열과 for문을 사용해서 3명의 이름을 입력받고 출력하기
        Scanner scan = new Scanner(System.in);

        String[] name = new String[3];

        //입력받기(for문) - 입력을 받은 후 배열의 각 요소에 저장
        for(int i = 0; i<3; i++){
            System.out.println(i+1 +"번째 이름 입력: ");
            name[i] = scan.next();
        }

        //출력하기(for문)
        for(int i=0; i<3; i++){
            System.out.println(i+1 + "번쨰 이름: " + name[i]);
        }

        scan.close();
    }
}
