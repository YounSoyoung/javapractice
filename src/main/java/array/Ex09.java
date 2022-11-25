package array;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[5];

        //for문으로 5개의 정수를 입력받아 배열의 각 요소에 저장하기
        for(int i=0; i<num.length; i++){
            System.out.print(i+1 + "번째 정수를 입력: ");
            num[i] = scan.nextInt();
        }

        int temp = 0;

        //index 0부터 작은 수로 채워주기 //5. 4. 3. 2. 1
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.println("num[" + i + "]: " + num[i]);
        }

    }
}
