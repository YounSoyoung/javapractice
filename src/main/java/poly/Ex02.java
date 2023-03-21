package poly;

class Run {
    int speed = 100;

    public void run() {
        System.out.println(speed + "의 속도로 달린다.");
    }
}

class Person extends Run {
    String name = "홍길동";

    @Override
    public void run() {
        System.out.println(name + "이 " + speed + "의 속도로 달린다.");
        walk();
    }

    public void walk(){
        System.out.println(name + "이 산책을 한다.");
    }
}

class KiaCar extends Run {
    String model = "k5";

    @Override
    public void run(){
        System.out.println(model + "가 " + speed + "의 속도로 달린다.");
        parking();
    }

    public void parking() {
        System.out.println(model + "가 주차를 한다.");
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Run run = new Person();
        System.out.println(run.speed);
//        System.out.println(run.name); //자식 멤버필드 접근안됨
//        run.walk(); //자식 멤버메소드 접근안됨

        run.run();
        //자식클래스에서 부모의 메소드를 오버라이딩해서 재정의했다면
        //오버라이딩된 메소드가 호출이 된다.
        //그 오버라이딩된 메소드에서 자식의 필드나 메소드가 접근 가능하다.
        System.out.println();

        run = new KiaCar();
        // (run 변수는 Run(부모) 타입이므로 KiaCar(자식) 객체로 바꿀 수 있다.)

        run.run();
    }
}
