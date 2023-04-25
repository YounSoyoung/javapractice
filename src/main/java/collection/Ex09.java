package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex09 {
    public static void main(String[] args) {
        //HashMap을 이용해서 아이디하고 비밀번호를 입력
        //아이디 <String> 비번 <String>
        //keySet 메소드로 Set에 key 값을 넣어준 뒤 Iterator를 이용해서
        //아이디와 비밀번호를 출력

        Map<String, String> map = new HashMap<>();

        map.put("abcd", "a1234");
        map.put("efgh", "b1234");
        map.put("weds", "c2354");
        map.put("geee", "d1257");

        Set<String> keySet = map.keySet();

        Iterator<String> iter = keySet.iterator();

        while (iter.hasNext()){
            String id = iter.next();
            String pw = map.get(id);
            System.out.println("ID: " + id + "PW: " + pw);
        }
    }
}
