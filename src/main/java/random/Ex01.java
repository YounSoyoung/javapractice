package random;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Math.random()*10);
        //Math.random()은 0~1 사이의 난수를 무작위로 생성한다.

        int su = (int)(Math.random()*10);
        System.out.println(su);

        //Math.random()을 사용해서 주사위 번호 하나를 뽑고 출력해보자

        int dice = (int)(Math.random()*6) + 1;
        System.out.println("나의 주사위 번호: " + dice);
    }
}
