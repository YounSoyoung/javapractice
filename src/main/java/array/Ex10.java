package array;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inwon;

        System.out.print("예약한 인원수를 입력: ");
        inwon = scan.nextInt();

        String[] person = new String[inwon];

        for(int i=0; i<person.length; i++){
            System.out.print(i+1 + "번째 예약손님 이름은: ");
            person[i] = scan.next();
        }

        System.out.println("총 인원은 " + inwon + "명 입니다.");

        for(int i=0; i<person.length; i++){
            System.out.println(i+1 + "번째 손님은 " + person[i] + "님 입니다.");
        }
    }
}
