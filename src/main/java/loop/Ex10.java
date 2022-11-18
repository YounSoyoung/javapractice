package loop;

public class Ex10 {
    public static void main(String[] args) {
        int i = 0;

        while(i<5){ //while은 조건값이 true이면 무한반복
            System.out.println("while문 안입니다. i: "+i);
            i++;
        }
        System.out.println("while문을 나왔습니다. i: " + i);
    }
}
