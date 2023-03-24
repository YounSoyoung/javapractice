package abstraction;

abstract class Hybrid { //추상클래스
    public int speed;
    public String color;

    public void upSpeed(int speed) {
        this.speed += speed;
    }

    abstract void run(); //추상메소드
    //추상메소드의 실제 구현은 자식클래스에서 한다
    //추상클래스에서만 추상메소드를 만들 수 있다.
}

class Niro extends Hybrid {
    //부모의 추상메소드는 자식클래스에서 강제 오버라이딩
    @Override
    void run(){
        System.out.println("니로가 " + speed + "의 속도로 달린다.");
    }
}

class Ioniq extends Hybrid {
    @Override
    void run() {
        System.out.println("아이오닉이 " + speed + "의 속도로 달린다.");
    }
}

public class Ex01 {
    public static void main(String[] args) {
//        Hybrid hybrid = new Hybrid();
        //추상클래스는 객체를 직접 생성하지 못한다.

        Hybrid myCar = new Niro();
        myCar.upSpeed(100);
        myCar.run();
        System.out.println();

        myCar = new Ioniq();
        myCar.upSpeed(150);
        myCar.run();
    }
}
