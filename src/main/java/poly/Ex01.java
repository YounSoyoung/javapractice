package poly;

//다형성: 부모클래스 타입으로 자식객체를 얻는 것
//1. 부모클래스가 가지고 있는 모든 멤버들에 접근할 수 있다.
//단, 자식클래스에서는 메소드오버라이딩을 했다면
//오버라이딩된 자식의 메소드가 호출된다.

//2. 멤버필드의 경우 부모클래스의 멤버필드에만 접근할 수 있다.
//자식클래스의 멤버필드는 오버라이딩이 된 자식의 메소드에 의해서만 접근할 수 있다.

class Parent {
    int parentMoney = 1000;

    public void showMoney() {
        System.out.println("money: " + this.parentMoney);
    }
}

class Child extends Parent {
    int childMoney = 500;

    @Override
    public void showMoney(){
        System.out.println("오버라이딩 메소드입니다.");
        System.out.println("이 메소드에서 자식의 필드와 자식의 메소드 접근가능");
        System.out.println("childMoney: " + this.childMoney);
    }
}

public class Ex01 {
    public static void main(String[] args){
        Parent poly = new Child(); //자동 타입변환(업캐스팅)
        //다형성은 부모타입의 변수를 자식객체로 생성하는 것
        //부모 이주이다. (부모필드와 부모메소드만 접근가능)

        System.out.println("money: " + poly.parentMoney);
//        System.out.println(poly.childMoney);

        Child poly2 = (Child)poly; //강제 타입변환(다운캐스팅)
        System.out.println("money: " + poly2.childMoney);

        Parent poly3 = poly2; //자동 타입변환(업캐스팅)
        System.out.println("money: " + poly3.parentMoney);

        poly3.showMoney();
    }
}
