package wrapper;

public class Ex01 {
    public static void main(String[] args) {
        //매개변수로 객체가 요구되는 경우
        //기본형이 아닌 객체로 저장해야 하는 경우
        //객체간의 비교가 필요한 경우
        //문자열을 기본값으로 바꿔야하는 경우 등에 wrapper 클래스가 쓰인다.
        //자바 Collection 인터페이스는 객체만 취급하기 때문에
        //기본타입을 객체로 사용해야 하는 경우가 있다.

        int a = 5; //기본타입 선언

        Integer b = new Integer(a);
        //기본타입의 값을 갖는 포장객체를 만든다.(박싱)

        int c = b.intValue();
        //박싱된 포장객체에서 다시 기본타입의 값을 얻는다. (언박싱)

        //JDK 1.5부터는 자동박싱과 자동언박싱이 지원된다.

        Integer d = 5; //자동박싱

        int e = d; //자동언박싱
    }
}
