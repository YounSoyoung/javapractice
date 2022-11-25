package method;

public class Ex01 {
    public static void method01(){ //메소드 리턴 타입은 무조건 적어줘야한다. 만약 리턴할 값이 없다면 리턴 타입을 void로 적어준다.
        System.out.println("void형 메소드는 돌려줄 값이 없음");
    }

    public static int method2(){
        System.out.println("리턴타입이 int형인 메소드");

        int b = 100;
        return b; //리턴값이 있다고(public static INT) 해줬으므로 return문을 무조건 적어줘야한다.
    }

    public static void main(String[] args){
        //자바는 main 메소드가 존재하는지 찾고 있으면 main 메소드만 먼저 실행한다.
        int a;

        method01(); //void형 메소드 호출, void형 메소드에서는 a=method1();처럼 무언가를 받을 수 없다. (리턴값이 없기 때문)

        a = method2(); //int 리턴타입 메소드 호출
        //method2에서 돌려준 100 값을 a로 받는다.

        System.out.println("method2에서 돌려준 값: " + a);
    }
}
