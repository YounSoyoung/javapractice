package inner;

//로컬 클래스
class LocalEx{
    public void method(){
        class Local { //로컬클래스, method 안에 생성된 class이기 때문에 method 실행이 끝나면 소멸한다.
                     // >> static을 사용할 수 없는 이유
            int x = 100;
//            static int y = 200; //static은 사용할 수 없다

            public void localClassMethod(){
                System.out.println("로컬클래스 메소드입니다");
                System.out.println("x: " + x);
            }
        }

        Local local = new Local();
        local.localClassMethod();
    }
}

public class Ex04 {
    public static void main(String[] args){
        LocalEx ex = new LocalEx();
        ex.method();
    }
}
