package loop;

public class Ex14 {
    public static void main(String[] args) {
        //break문
        int a = 0;

        while(a < 10){
            System.out.println(a);
            if(a==5){
                break;
            }
            a++;
        }
    }
}
