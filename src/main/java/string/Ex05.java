package string;

public class Ex05 {
    public static void main(String[] args) {
        //toLowercase: 문자열에 대문자를 소문자로 변환
        String str1 = "abcDEF";
        System.out.println("toLowerCase: " + str1.toLowerCase());

        //toUpperCase: 문자열에 소문자를 대문자로 변환
        String str2 = "abcDEF";
        System.out.println("toupperCase: " + str2.toUpperCase());

        //toString: 문자열을 그대로 반환
        String str3 = "Hello world";
        System.out.println(str3.toString());

        Integer a = 100;
        System.out.println(a.toString());

        //trim: 문자열에 압 뒤 공백을 없애준다.
        String str4 = "           Java java java     ";
        System.out.println("trim: " + str4.trim());
    }
}
