package expression;

import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";

        String tel = "010-1111-1111";

        if(Pattern.matches(pattern, tel)){
            System.out.println("올바른 전화번호 형식입니다.");
        }else {
            System.out.println("올바른 전화번호 형식이 아닙니다.");
        }
    }
}
