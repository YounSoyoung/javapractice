package wrapper;

public class Ex02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a == b);

        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer(100);

        //포장객체 비교
        System.out.println(obj1 == obj2);

        //내부에 데이터 비교를 할 때는 equals 메소드를 사용
        System.out.println(obj1.equals(obj2));
    }
}
