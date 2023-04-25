package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        //Set : 데이터의 저장순서를 유지하지 않는다.
        //데이터의 중복저장을 허용하지 않는다.

        Set<String> set = new HashSet<>();

        set.add(new String("홍길동"));
        //원칙: new 연산자를 이용해서 객체를 넣는다.
        set.add("이순신");
        set.add("성춘향");
        set.add("이몽룡");
        set.add("이순신"); //중복저장X

        System.out.println("Set에 저장된 전체객체의 수: " + set.size());

        Iterator<String> setIter = set.iterator();

        while (setIter.hasNext()){
            String name = setIter.next();
            System.out.println(name);
        }

        set.remove("홍길동"); //"홍길동" 객체를 삭ㅈ제
        System.out.println();

        setIter = set.iterator();

        while (setIter.hasNext()){
            String name = setIter.next();
            System.out.println(name);
        }

        set.clear(); //전체삭제

        if(set.isEmpty()){
            System.out.println("비어있음");
        }else {
            System.out.println("비어있지 않음");
        }
    }
}
