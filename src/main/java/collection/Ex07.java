package collection;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex07 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(new Integer(1), new String("홍길동"));
        //원칙 : new 연산자를 사용해서 객체를 넣는다.
        map.put(2, "성춘향");
        map.put(3, "이순신");
        map.put(4, "이몽룡");

        //저장된 key 객체의 수를 얻기
        System.out.println("Map Entry: " + map.size());

        System.out.println(map.get(1)); //key 객체로 value 객체를 얻는다.

        //객체를 하나씩 처리
        Set<Integer> keySet = map.keySet(); //모든 key 객체를 Set 타입으로 반환

        Iterator<Integer> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            int key = keyIter.next();
            String value = map.get(key);
            System.out.println("key: " + key + ", value: " + value);
        }
        System.out.println();

        map.remove(1);

        System.out.println("Map Entry: " + map.size());

        map.clear();  //전체 삭제

        if(map.isEmpty()){
            System.out.println("요소가 비어있습니다.");
        }
    }
}
