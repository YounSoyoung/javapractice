package abstraction;

abstract class Car {
    String color;
    int speed;

    public Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public abstract void work();
    public abstract void carProfile();
}

//Car 클래스를 상속받는 Sedan 클래스를 만들어
//추상메소드를 오버라이딩하여 구현부를 채워보자
class Sedan extends Car{

    public Sedan(String color, int speed) {
        super(color, speed);
    }

    @Override
    public void work() {
        System.out.println("승용차가 사람을 태우고 있습니다.");
    }

    @Override
    public void carProfile() {
        System.out.println("세단의 색깔은: " + color);
        System.out.println("세단의 속도는: " + speed);
    }
}

class Truck extends Car{

    public Truck(String color, int speed) {
        super(color, speed);
    }

    @Override
    public void work() {
        System.out.println("트럭이 짐을 싣고 있습니다.");
    }

    @Override
    public void carProfile() {
        System.out.println("트럭의 색깔은: " + color);
        System.out.println("트럭의 속도는: " + speed);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("빨간색", 100);
        sedan.work();
        sedan.carProfile();
        System.out.println();

        Truck truck = new Truck("파란색", 120);
        truck.work();
        truck.carProfile();
    }
}
