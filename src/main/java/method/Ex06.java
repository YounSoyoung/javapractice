package method;

import java.util.Scanner;

public class Ex06 {
    //전원을 켜는 powerOn 메소드와 전원을 끄는 powerOff 메소드 만들기
    public static void powerOn(){
        System.out.println("전원을 켜준다.");
    }

    public static void powerOff(){
        System.out.println("전원을 꺼준다.");
        System.exit(0);
    }

    //2개의 정수를 매개변수로 받아 사칙연산 계산 후 결과를 반환해주는 메소드 만들기
    //나누기는 2개의 실수를 매개변수로 받아 계산 후 실수를 반환해주는 메소드 만들기
    //add subtract multiply divide 메소드
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }

    //정수값을 매개변수로 받아 출력해주는 outPut 메소드 만들기
    //실수값을 매개변수로 받아 출력해주는 outPut 메소드 만들기
    public static void outPut(int result){
        System.out.println("결과: " + result);
    }

    public static void outPut(double result){
        System.out.println("결과: " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        powerOn();

        while(true){
            System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.전원끄기");

            int choice = scan.nextInt();

            if(choice==5){
                powerOff();
            }

            System.out.print("첫번째 수를 입력: ");
            int x = scan.nextInt();
            System.out.print("두번째 수를 입력: ");
            int y = scan.nextInt();

            switch (choice){
                case 1:
                    int result1 = add(x, y);
                    outPut(result1);
                    break;

                case 2:
                    int result2 = subtract(x, y);
                    outPut(result2);
                    break;

                case 3:
                    int result3 = multiply(x, y);
                    outPut(result3);
                    break;

                case 4:
                    double result4 = divide(x, y);
                    outPut(result4);
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다");
            }

        }
    }
}
