package loop;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        //커피숍 주문받기

        Scanner scan = new Scanner(System.in);

        int menu;

        do{
            System.out.println("주문하시겠습니까?");
            System.out.println("1.아메리카노 2.카페라떼 3.아이스티 4.그만주문");

            menu = scan.nextInt();

            switch (menu){
                case 1:
                    System.out.println("#아메리카노 주문하셨습니다");
                    break;
                case 2:
                    System.out.println("#카페라떼 주문하셨습니다");
                    break;
                case 3:
                    System.out.println("#아이스티 주문하셨습니다");
                    break;
                case 4:
                    System.out.println("또 오세요~");
                    break;
                default:
                    System.out.println("잘못주문 하셨습니다.");
            }
        }while(menu != 4);
    }
}
