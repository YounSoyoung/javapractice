package collection;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {
        //String 타입의 HashSet 클래스를 생성한 후
        //과일의 이름을 5개 넣는다.
        //반복자를 사용해서 하나씩 출력

        Set<String> set = new HashSet<>();

        set.add(new String("사과"));
        set.add("오렌지");
        set.add("바나나");
        set.add("멜론");
        set.add("키위");

        Iterator<String> setIter = set.iterator();

        while (setIter.hasNext()){
            String fruit = setIter.next();
            System.out.println(fruit);
        }
    }
}
