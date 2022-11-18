package loop;

public class Ex08 {
    public static void main(String[] args) {
        //이중 for문을 사용해서 구구단 2~9단까지 출력해보기

        int dan;
        int num;

        //dan = 2; dan <=9; dan++

        for(num=1; num <= 9; num++){
            for(dan = 2; dan <= 9; dan++){
                System.out.printf("%dX%d=%d\t", dan, num, dan*num);
            }
            System.out.println();
        }
    }
}
