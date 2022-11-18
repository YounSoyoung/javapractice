package loop;

public class Ex11 {
    public static void main(String[] args) {
        //while문을 사용해서 1~10까지 합 구하기

        int i = 1;
        int sum = 0;

        while(i <= 10){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
