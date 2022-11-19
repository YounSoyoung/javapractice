package array;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};

        //값을 입력받아 배열의 해당하는 인덱스 출력하기
        Scanner scan = new Scanner(System.in);

        System.out.println("배열의 값은 10, 20, 30, 40입니다.");
        System.out.print("값을 입력: ");
        int i = scan.nextInt();

//        for(int j=0; j<4; j++){
//            if(array[j] == i){
//                System.out.println(i+"의 인덱스는 [" + j + "]");
//            }
//        }

        int a=0;
        int count = 0;

        while (a<4){
            if(array[a] == i){
                System.out.println(i+"의 인덱스는 "+a);
                count++;
            }
            a++;
        }

        if(count == 0){
            System.out.println("배열 안에 해당값이 없습니다.");
        }

    }
}
