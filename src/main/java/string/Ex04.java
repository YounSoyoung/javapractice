package string;

public class Ex04 {
    public static void main(String[] args) {
        String str = "Hello Java";

        //indexOf: 문자열에 지정한 문자가 처음 몇 번째에 있는지를 반환
        System.out.println("indexOf: " + str.indexOf("a"));

        //lastIndexOf: 문자열에 지정한 문자가 마지막 몇 번쨰에 있는지를 반환
        System.out.println("lastIndexOf: " + str.lastIndexOf("a"));

        //substring: 문자열에 지정한 범위에 속하는 문자열을 반환
        // (시작범의에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다)
        String str1 = "ABCDEFG";
        String substring = str1.substring(0, 2);
        System.out.println("substring: " + substring);
    }
}
