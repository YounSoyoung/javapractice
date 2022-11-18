package loop;

public class Ex03 {
    public static void main(String[] args) {
        //for문을 사용해서 1~10까지 합 구하기
        int sum = 0;

        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
