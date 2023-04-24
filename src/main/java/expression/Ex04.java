package expression;

import java.util.Scanner;
import java.util.regex.Pattern;

class Profile{
    String name;
    int age;
    String tel;
    String email;

    public Profile(String name, int age, String tel, String email){
        super();
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public void profilePrint(){
        System.out.println(name + "님의 프로필 정보");
        System.out.println("나이: " + age + "살");
        System.out.println("전화번호: " + tel);
        System.out.println("이메일: " + email);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        //Scanner로 이름, 나이, 전화번호, 이메일 입력받기
        //이름, 전화번호, 이메일은 정규표현식을 사용해서 올바르게 입렵받았는지 알아보기
        //나이는 입력받고 if문으로 20살부터 60살까지 유효성 검사를 해보자
        //모두 올바르게 입력받았다면 Profile 객체 생성 후 profilePrint 메소드 호출하기

        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = scan.next();

        System.out.println("나이는 20~60살까지 입력해주세요");
        System.out.print("나이 입력: ");
        int age = scan.nextInt();

        System.out.print("전화번호 입력: ");
        String tel = scan.next();

        System.out.print("이메일 입력: ");
        String email = scan.next();

        boolean nameCheck = Pattern.matches("[가-힣]*", name);
        boolean ageCheck;
        if(age > 19 && age <= 60){
            ageCheck = true;
        }else {
            ageCheck = false;
        }

        boolean telCheck = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", tel);

        boolean emailCheck = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        if(nameCheck == true && ageCheck == true && telCheck == true && emailCheck == true){
            Profile profile = new Profile(name, age, tel, email);
            System.out.println("프로필이 정상적으로 등록되었습니다.");
            profile.profilePrint();
        }else {
            System.out.println("프로필이 등록되지 않았습니다.");
        }
    }
}
