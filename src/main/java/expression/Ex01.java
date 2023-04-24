package expression;

import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        String pattern = "^[0-9]*$";

        String number = "123456a";

        if(Pattern.matches(pattern, number)){
            System.out.println("숫자만 포함되어 있습니다.");
        }else{
            System.out.println("숫자가 아닌 값이 포함되어 있습니다");
        }
    }
}
