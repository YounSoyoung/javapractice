package collection;

import java.util.HashMap;
import java.util.Map;

public class Ex08 {
    public static void main(String[] args) {
        //HashMap을 사용해서 과목하고 성적을 입력
        //과목: 국어 영어 수학
        //과목 성적 <String, Integer>
        //key 객체로 value 객체 얻어서 출력하기

        Map<String, Integer> map = new HashMap<>();

        map.put("국어", 90);
        map.put("영어", 84);
        map.put("수학", 97);

        int kor = map.get("국어");
        int eng = map.get("영어");
        int math = map.get("수학");

        System.out.println("국어 점수: " + kor);
        System.out.println("영어 점수: " + eng);
        System.out.println("수학 점수: " + math);
    }
}
