package inner;

//Outer 클래스의 static 멤버 Inner 클래스

class Outer3{
    private int x = 100;
    private static int y = 200;

    static class Inner3{
        private int z = 300;
        private static int zz = 400;

        public void disp(){
            //static 멤버 클래스에서 바깥쪽 인스턴스 멤버는 사용할 수 없다
//            System.out.println("x: " + x);
            System.out.println("Outer y : " + y);
            System.out.println("Inner z: " + z);
            System.out.println("Inner zz: " + zz);
        }
    }
}

public class Ex03 {
    public static void main(String[] args){
        Outer3.Inner3 inner = new Outer3.Inner3();

        inner.disp();
    }
}
