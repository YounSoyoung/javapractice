package interface1;

import jdk.nashorn.api.tree.SimpleTreeVisitorES5_1;

import javax.management.PersistentMBean;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String tel;
    private String address;

    //생성자의 매개값을 매개변수로 받아 필드초기화
    //필드를 출력해주는 profile 메소드 만들기

    public Person(String name, int age, String tel, String address){
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.address = address;
    }

    public void profile(){
        System.out.println("------------------------------");
        System.out.println(name + "님의 나이: " + age);
        System.out.println(name + "님의 전화번호: " + tel);
        System.out.println(name + "님의 주소: " + address);
        System.out.println("------------------------------");
    }
}

interface PersonService {
    public abstract void personList(Person[] person);

    public abstract Person[] insert(int personSu);
}

class PersonserviceImpl implements PersonService {
    Scanner scan = new Scanner(System.in);

    @Override
    public void personList(Person[] person){
        //배열 안의 Person 객체의 이름 나이 전화번호 출력
        for(int i = 0; i<person.length; i++){
            person[i].profile();
        }
    }

    @Override
    public Person[] insert(int personSu){
        //정수만큼의 Person 타입의 배열 생성 후에
        //반복문에서 이름 나이 전화번호 주소 입력받아
        //Person 객체를 생성 후 배열의 각 요소에 저장한 후 배열 리턴
        Person[] person = new Person[personSu];

        for(int i = 0; i < personSu; i++){
            System.out.print(i+1 +"번째 사람의 이름: ");
            String name = scan.next();
            System.out.print(i+1 + "번째 사람의 나이: ");
            int age = scan.nextInt();
            System.out.print(i+1 + "번째 사람의 전화번호: ");
            String tel = scan.next();
            System.out.print(i+1 + "번째 사람의 주소: ");
            String address = scan.next();

            person[i] = new Person(name, age, tel, address);

        }
        return person;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        PersonService service = new PersonserviceImpl();
        Person[] person = service.insert(3);
        service.personList(person);
    }
}
