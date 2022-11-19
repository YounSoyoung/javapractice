package array;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int[] intArray = {100, 200, 300, 400, 500};

        //index를 입력받아 배열의 해당하는 요소의 값 출력하기

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 배열의 인덱스는 0~4까지 입니다.");
        System.out.print("index를 입력: ");
        int a = scan.nextInt();

        if(a < 0 || a >= intArray.length){
            System.out.println("인덱스를 잘못 입력하셨습니다.");
        }else System.out.println("intArray["+ a + "]: " + intArray[a]);

        scan.close();
    }
}
