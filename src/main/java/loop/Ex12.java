package loop;

public class Ex12 {
    public static void main(String[] args) {
        //중첩(이중) while문을 사용해서 구구단 2~9단 출력

        int dan = 2;
        int num = 1;

        while(num <=9){
            while(dan <= 9){
                System.out.printf("%dX%d=%d\t", dan, num, dan*num);
                dan++;
            }
            System.out.println();
            num++;
            dan = 2;
        }
    }
}
