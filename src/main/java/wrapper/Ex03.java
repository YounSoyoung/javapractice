package wrapper;

public class Ex03 {
    public static void main(String[] args) {
        //문자열을 기본타입의 값으로 바꿀 때
        //parse + 기본타입 이름

        String str = "100";

        //정수로 변환
        int number = Integer.parseInt(str);
        System.out.println(number);

        //실수로 변환
        str = "3.14";

        double value = Double.parseDouble(str);
        System.out.println(value);
    }
}
