package variable;

public class Ex02 {
    public static void main(String[] args) {
        int a; //정수타입 변수 선언, 메모리 공간을 할당, 메모리의 이름은 a
        a = 10; //선언 후 저장: 초기화
                // = 은 오른쪽의 값을 왼쪽 변수에 저장한다.
//        a = 20;
        // 같은 이름의 변수가 2개가 있으면 프로그램에서는 어떤 변수를 골라야 하는지 모른다.

        int b;
        b = 20;

        System.out.println(a);
        System.out.println(b);

        int c = 30; //선언과 동시에 초기화
        int d = 40;

        System.out.println(c);
        System.out.println(d);
    }
}
