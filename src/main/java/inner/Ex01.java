package inner;

//Inner 클래스에서 Outer 클래스 멤버 접근 예제

class Outer1 {
    public int x = 100;
    private int y = 200;

    public void outerMethod1(){
        System.out.println("public 바깥클래스 메소드");
    }

    private void outerMethod2(){
        System.out.println("private 바깥클래스 메소드");
    }

    class Inner1 {
        //인스턴스 멤버 클래스에서 정적멤버는 만들 수 없다
//        private static int z =300;

        public void disp(){
            System.out.println("Outer x : " + x);
            System.out.println("Outer y : " + y);
            outerMethod1();
            outerMethod2();
        }
    }
}

public class Ex01 {
    public static void main(String[] args){
        //우선 바깥쪽 클래스 객체를 생성해준다
        Outer1 outer = new Outer1();

        Outer1.Inner1 inner = outer.new Inner1();
        //생성된 객체로 안쪽 클래스 객체 생성

        inner.disp();
    }
}
