package exception;

public class Ex01 {
    public static void main(String[] args) {
//        system.out.println();
        //컴파일에러: 컴파일 자체가 안됨
        //자바컴파일러: 번역(구문체크)

//        System.out.println(args[0]);
        //실행에러: 실행 중 발생

        try{
            //예외가 발생할 가능성이 있는 코드들을 넣는다.
            System.out.println("안녕하세요");
            System.out.println(args[0]);
            System.out.println("안녕하세요");
        }catch (Exception e){
            //예외처리를 위한 코드를 넣는다,
            System.out.println("예외가 발생이 되었습니다.");
        }finally {
            //예외의 발생여부에 관계없이 항상 수행되어야 하는 코드들을 넣는다.
            //finally 블록은 try-catch문의 맨 마지막에 위치해야 한다.
            System.out.println("항상 수행됩니다.");
        }

    }
}
