package collection;

//Student 클래스를 만든다.
//필드는 int studentID, String name, String department;이다
//생성자를 통해 필드초기화를 하고 profile 메소드를 만들어
//학번 이름 학과를 출력해보자

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int studentID;
    String name;
    String department;

    public Student(int studentID, String name, String department){
        this.studentID = studentID;
        this.name = name;
        this.department = department;
    }

    public void profile(){
        System.out.println("학번: " + studentID + " || 이름: " + name + " || 학과: " + department);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(202201, "홍길동", "컴퓨터"));
        list.add(new Student(202202, "성춘향", "요리"));
        list.add(new Student(202203, "이순신", "경영"));

        //일반 for문, 향상된 for문, Iterator를 사용해서
        //학번 이름 학과 출력하기

        System.out.println("------------[일반 for문]---------------");
        for(int i = 0; i < list.size(); i++){
            Student stu = list.get(i);
            stu.profile();
        }
        System.out.println();

        System.out.println("-------------[향상된 for문]---------------");
        for(Student stu : list){
            stu.profile();
        }
        System.out.println();

        System.out.println("-------------[Iterator]---------------");
        Iterator<Student> iter = list.iterator();

        while (iter.hasNext()){
            Student stu = iter.next();
            stu.profile();
        }
    }
}
