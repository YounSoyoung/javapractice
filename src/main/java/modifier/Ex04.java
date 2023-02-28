package modifier;

public class Ex04 {
    static { //static 필드 초기화
        System.out.println("static 블록");
    }

    {//인스턴스 블록: 객체초기화
        System.out.println("인스턴스 블록");
    }

    public Ex04(){
        System.out.println("생성자");
    }

    public static void main(String[] args){
        System.out.println("메인메소드 시작!");

        Ex04 ex1 = new Ex04();

        System.out.println("---------------------------------");

        Ex04 ex2 = new Ex04();

        System.out.println("메인메소드 끝!");
    }
}
