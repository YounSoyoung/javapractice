package loop;

public class Ex02 {
    public static void main(String[] args) {
        int i;

        for(i = 1; i<=5; i++){
            System.out.println("for문 안입니다. i: " + i);
        }//i: 1 ~ 5까지

        System.out.println("for문을 나왔습니다. i: " + i);
        //i++로 한 번 더 더해져서 i=6, 이제 조건에 맞지 않아서 for문에서 빠져나오게 된다.

        //for문을 사용해서 2, 4, 6, 8, 10을 출력
        for(int a=2; a<=10; a+=2){
            System.out.println("a: " + a);
        }
        //System.out.println(a); //for문에서 a를 지정해줬기 때문에 밖에서는 사용할 수 없다.
    }
}
