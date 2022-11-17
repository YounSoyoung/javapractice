package condition;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        //0 ~ 100점까지의 점수를 입력받아
        //switch ~ case 문을 사용해서 성적 처리하기

        //90~100점 A
        //80~89점 B
        //70~79점 C
        //60~69점 D
        //나머지 F

        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int score = scan.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
