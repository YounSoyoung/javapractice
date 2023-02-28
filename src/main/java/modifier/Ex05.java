package modifier;

class Person {
    static final String NATION = "KOREA";
    //정적 불변의 상수(메모리의 메소드 영역(최상단)에 올라가므로 반드시 선언과 동시에 초기화)
    //역할: 공용데이터

    final String SSN;
    //불변의 인스턴스 상수
    //선언과 동시에 초기화를 하거나, 혹은 생성자에서 단 한번만 초기화가 이루어진다

    String name;
    int age;

    public Person(String ssn, String name, int age) {
        this.SSN = ssn;
        this.name = name;
        this.age = age;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Person person = new Person("123456-1234567", "홍길동", 20);

        System.out.println("국가: " + person.NATION);
        System.out.println("주민번호: " + person.SSN);
        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);
        System.out.println();

        //상수는 절대로 한번만 초기화가 가능하고 수정이 안된다.
//        person.NATION = "USA";
//        person.SSN = "111111-1111111";

        person.name="홍길순";
        person.age=22;

        System.out.println("국가: " + Person.NATION); //static 방법으로 접근
        System.out.println("주민번호: " + person.SSN);
        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);
        System.out.println();

        //보통 프로그래밍에서 상수라는 용어는 static final이다.
    }
}
