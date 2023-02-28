package modifier;

public class Ex03 {
    int x = 100; //인스턴스 멤버 변수
    static int y = 200; //정적 멤버변수

    //정적메소드
    public static void disp(){
//        System.out.println(x);
        //정적메소드는 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다
        System.out.println(y);
    }

    public static void main(String[] args){
        Ex03 ex = new Ex03();
        System.out.println(ex.x);
        System.out.println(ex.y);
        ex.disp(); //객체로서 접근

        //정적메소드는 원칙적으로 클래스 이름으로 접근
        Ex03.disp();
    }
}
