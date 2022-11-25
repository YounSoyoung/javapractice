package random;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //로또 게임

        Scanner scan = new Scanner(System.in);

        int[] lotto = new int[6];
        int[] myLotto = new int[6];

        int count = 0;

        //1. lotto 배열에 로또번호 뽑기 (중복수X)
        for(int i=0; i<lotto.length; i++){
            lotto[i] = (int)(Math.random()*45) + 1;

            for(int j=0; j<i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }

        //2. 내가 1~45까지의 정수를 입력 받아
        // myLotto 배열의 각 요소에 입력받은 번호를 넣기
        // (1~45 사이의 정수만, 같은 번호를 엽력받지 않기)

        for(int i=0; i<myLotto.length; i++){
            System.out.print(i+1+ "번째 번호 입력: ");
            myLotto[i] = scan.nextInt();

            if(myLotto[i] < 1 || myLotto[i] > 45){
                System.out.println("1 ~ 45 사이의 정수만 입력해주세요");
                i--;
                continue;
            }

            for(int j=0; j<i; j++){
                if(myLotto[i] == myLotto[j]){
                    System.out.println("같은 번호는 입력할 수 없습니다.");
                    i--;
                    break;
                }
            }
        }

        //3. lotto 배열과, myLotto 배열의 수를 비교하여
        // 몇 개나 맞추었는지 count 변수로 알아보기

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lotto[i] == myLotto[j]){
                    count++;
                }
            }
        }

        for(int i=0; i<6; i++){
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
        for(int i=0; i<6; i++){
            System.out.println(myLotto[i]+" ");
        }
        System.out.println("\n맞춘 로또 번호의 개수: " + count);
    }
}
