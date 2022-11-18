package loop;

public class Ex09 {
    public static void main(String[] args) {
        //이중 for문 별 하나만 사용해서 모양 만들기
        //System.out.print("*")

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
