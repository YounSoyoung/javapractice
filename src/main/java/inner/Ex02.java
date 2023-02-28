package inner;

//Outer 클래스에서 Inner 클래스 멤버 접근 예제

import java.util.PrimitiveIterator;

class Outer2 {
    class Inner2 {
        public int x = 100;
        private int y = 200;

        public void innerMethod1(){
            System.out.println("public 안쪽 클래스 메소드");
        }

        private void innerMethod2(){
            System.out.println("private 안쪽 클래스 메소드");
        }
    }

    public void disp(){
//        System.out.println(x);
//        System.out.println(y);

        Outer2.Inner2 inner = this.new Inner2();
        //이런 식으로 접근가능
        Inner2 inner2 = new Inner2();
        System.out.println("Inner x: " + inner2.x);
        System.out.println("Inner y: " + inner2.y);
        inner2.innerMethod1();
        inner2.innerMethod2();
    }
}

public class Ex02 {
    public static void main(String[] args){
        Outer2 outer = new Outer2();

        outer.disp();
    }
}
