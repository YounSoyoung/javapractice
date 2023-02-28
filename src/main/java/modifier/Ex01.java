package modifier;

public class Ex01 {
    static int count1 = 0;
    //static: 메모리 상의 정적이다.
    //프로그램 시작 시 메모리의 메소드 영역(최상단)에 할당된다.
    //공유되는 전역변수이다.

    int count2 = 0;
    //인스턴스 변수: 객체가 생성될 때 객체가 가지고 있는 변수
    //인스턴스 변수는 객체마다 공유되지 않는다

    public void increase(){
        count1++;
        count2++;
        System.out.println("count1: " + count1);
        System.out.println("count2: " + count2);
    }

    public static void main(String[] args){
        Ex01 ex1 = new Ex01();
        ex1.increase();
        System.out.println();

        Ex01 ex2 = new Ex01();
        ex2.increase();
        System.out.println();

        Ex01 ex3 = new Ex01();
        ex3.increase();
    }
}
