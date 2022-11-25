package method;

import java.util.Scanner;

public class Ex08 {

    //1~10까지의 정수 중 하나를 반환해주는 메소드 만들기
    public static int randomSu(){
        int su = (int)(Math.random()*10) + 1;
        return su;
    }

    //정수 하나를 매개변수로 받아 그 수만큼의 길이의
    //String 타입의 배열을 만들고 반복문을 사용해서 이름을 입력받아
    //String 배열의 각 요소에 저장 후 String 배열을 리턴하는 메소드
    public static String[] names(int num){
        String[] names = new String[num];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<num; i++){
            System.out.print(i+1+ "번째 이름 입력: ");
            names[i] = scan.next();
        }
        return names;
    }

    //String 배열을 매개변수로 받아서
    //배열 안의 요소(이름)들을 출력해주는 메소드 만들기
    public static void namePrint(String[] names){
        for(int i=0; i<names.length; i++){
            System.out.println(i+1 + "번째 이름은: " + names[i]);
        }
    }

    public static void main(String[] args) {
        int number = randomSu();

        System.out.println("메소드로 얻은 정수: " + number);

        String[] names = names(number);
        namePrint(names);

    }

}
