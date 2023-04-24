package exception;

public class Ex03 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            //예외에 대한 정보를 화면에 출력
            System.out.println(ae.getMessage());
        }
    }
}
