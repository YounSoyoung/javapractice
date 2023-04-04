package string;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = "Hello world";

        //chatAt: 해당 위치의 문자 하나를 char형으로 반환
        System.out.println("charAt : " + str1.charAt(6));

        //isEmpty: 해당 변수가 비어있으면 true를 아니면 false를 반환
        System.out.println("isEmpth : " + str1.isEmpty() );

        //length: 문자열의 길이를 반환
        System.out.println("length: " + str1.length());

        //toCharArray : 문자열을 한글자씩 char 배열로 반환
        char[] array = str1.toCharArray();

        for(char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();

        //replace: 문자열을 교체해준다.
        System.out.println(str1.replace("Hello", "Hi"));
    }
}
