package exception;

public class Ex04 {
    public static void method1() throws ClassNotFoundException{
        //throws는 호출한 곳에서 예외처리
        Class.forName("exception.Ex05");
    }

    public static void main(String[] args){
        try{
            method1();
        }catch (ClassNotFoundException e){
            System.out.println("해당 클래스를 찾을 수 없습니다.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("예외의 관계여부에 상관없이 실행");
        }
    }
}
