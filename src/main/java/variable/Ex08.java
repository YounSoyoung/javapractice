package variable;

public class Ex08 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // 자동 타입 변환

        System.out.println(b);

//        char ch = a;
        //음수가 저장될 수 있는 byte 타입을 char 타입으로 자동 타입 변환 시킬 수 없다.

        char ch1 = 'A';
        int c = ch1; //char 값은 실제로는 정수로 저장이 된다. 그러므로 int 타입으로 자동타입변환 될 수 있다.
        System.out.println(c);

        byte d = 10;
        byte e = 20;

        //byte result1 = d + e; //오류
        //정수의 연산시에는 기본타입인 int 타입으로 연산한다. 그러므로 byte 타입이 받을 수 없다.
        int result2 = d + e;
        System.out.println(result2);

        int f = 10;
        double g = 10.2;
        double result3 = f + g;
        //int 타입 피연산자가 double 타입으로 자동 타입변환이 되고 연산을 수행
        System.out.println(result3);
    }
}
