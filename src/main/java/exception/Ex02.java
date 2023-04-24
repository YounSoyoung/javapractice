package exception;

public class Ex02 {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
            //0으로 나눌 수 없다. ArithmeticException 발생
            System.out.println(args[0]);
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException 예외발생!");
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("ArrayIndexOutofBoundsException 예외발생");
        }catch (Exception e){
            //ArithmeticException과 ArrayIndexOutOfBoundsException을
            //제외한 모든 예외처리
            System.out.println("Exception 예외발생!");
        }
    }
}
