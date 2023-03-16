package inheritance;

class Sedan {
    String color;

    public Sedan() { //기본생성자
        System.out.println("Sedan 클래스 생성자 호출");
    }

    public Sedan(String str){ //매개변수 생성자
        System.out.println("Sedan 클래스 생성자 호출: " + str);
    }
}

class Sonata extends Sedan {
    String color;

    public Sonata(String str){
//        super(); //부모 클래스의 기본 생성자를 호출
        super(str); //자식 생성자의 첫번째 줄에서 무조건 부모의 생성자를 호출해줘야한다.
        System.out.println("Sonata 클래스 생성자 호출: " + str);
    }

    public void setColor(String color){
        this.color = color;
        //super.color = color;로 부모필드에 접근해야한다.
        //하지만 필드를 물려받았기 때문에 this.color로 부모필드에 접근가능
    }

    public void colorPrint(){
        System.out.println("소나타 색상은: " + super.color);
    }
}

public class Ex02 {
    public static void main(String[] args){
        Sonata sonata = new Sonata("소나타 객체생성");
        sonata.setColor("검정");
        sonata.colorPrint();
    }
}
