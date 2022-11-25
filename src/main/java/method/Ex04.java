package method;

public class Ex04 {
    //전원을 켜는 powerOn 메소드와
    //정수 매개값 2개를 매개변수로 받아서 더한 다음
    //더한 결과를 반환해주는 add 메소드를 만들어보자
    public static void powerOn(){
        System.out.println("전원이 켜졌습니다.");
    }

    public static int add(int a, int b){
        int hap = a + b;
        return hap;
    }


    public static void main(String[] args) {
        powerOn();

        int hap = add(2, 3);
        System.out.println("2+3= " + hap);
    }
}
