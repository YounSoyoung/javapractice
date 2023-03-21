package poly;

//필드의 다형성

class Car {
    //필드
    Tire tire = new Tire();
}

class Tire {
    public String tireName;

    public Tire(){
        tireName = "정품타이어";
    }
}

public class Ex03 {
}
