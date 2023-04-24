package expression;

import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String pattern = "[가-힣]*";
        String koreaName = "홍길동";

        if(Pattern.matches(pattern, koreaName)){
            System.out.println("올바른 한글 이름입니다.");
        }else {
            System.out.println("올바른 한글 이름이 아닙니다.");
        }

        String pattern2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        String email = "hong@naver.com";

        if(Pattern.matches(pattern2, email)){
            System.out.println("올바른 이메일 형식입니다.");
        }else{
            System.out.println("올바른 이메일 형식이 아닙니다.");
        }
    }
}
