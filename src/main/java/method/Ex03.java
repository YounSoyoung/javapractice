package method;

public class Ex03 {
    //이름과 나이의 데이터를 매개변수로 받아서
    //이름과 나이를 출력해주는 profilePrint 메소드 만들기

    public static void profilePrint(String name, int age){
        System.out.println("이름을 입력: " + name);
        System.out.println("나이를 입력: " + age);
    }

    public static void main(String[] args) {
        profilePrint("홍길동", 20);

        String name = "성춘향";
        int age = 22;

        profilePrint(name, age);
    }

}
