package array;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //학생 3명의 이름, 국어, 영어 성적을 입력 받고
        // 총점과 순위를 나타내고

        Scanner scan = new Scanner(System.in);

        String[] name = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] total = new int[3];
        int[] rank = new int[3];

        //데이터 입력 받기(입력 받으면서 총점 구하기)
        for(int i=0; i<3; i++){
            System.out.println("이름 입력: ");
            name[i] = scan.next();
            System.out.println("국어 점수 입력: ");
            kor[i] = scan.nextInt();
            System.out.println("영어 점수 입력: ");
            eng[i] = scan.nextInt();
            total[i] = kor[i] + eng[i];
        }

        //순위 구하기: 우선 1등으로 초기화를 하고,
        //다른 학생 성적과 내 성적의 총점을 비교하여(이중 for문, if)
        //다른 학생 성적보다 내 성적이 적다면 순위를 하나 올려준다.
        for(int i=0; i<3; i++){
            rank[i] = 1;
            for(int j=i+1; j<3; j++){
                if(total[i] < total[j]){
                    rank[i]++;
                }
            }
        }

        for(int i=0; i<3; i++){
            System.out.println(name[i] + "의 총점은 " + total[i] + "점으로 " +rank[i] + "등입니다.");
        }

        scan.close();

    }
}
