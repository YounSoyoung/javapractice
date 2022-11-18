package loop;

public class Ex04 {
    public static void main(String[] args) {
        //0부터 90까지 10단위로 출력하기

        for(int i = 0; i<=90; i+=10){
            if(i!=90){
                System.out.printf("%d, ", i);
            }else System.out.print(i);
        }
    }
}
