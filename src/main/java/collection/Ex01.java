package collection;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //List: 데이터를 일렬로 늘어놓은 자료구조
        //데이터의 중복허용, 순서중요

        list.add(new String("홍길동"));
        //원칙: new 연산자를 이용해서 객체를 넣는다.
        list.add("성춘향");
        list.add("이몽룡");

        int size = list.size(); //저장되어 있는 전체 객체의 수를 반환

        System.out.println("총 객체 수 : " + size);

        for(String str : list){    //향상된 for문
            System.out.println(str);
        }
        System.out.println();

        list.add(0, "이순신"); //index 0번에 "이순신" 객체를 끼워넣는다
        //이순신 홍길동 성춘향 이몽룡

        list.add(2, "장보고"); //index 2번에 "장보고" 객체를 끼워 넣는다.
        //이순신 홍길동 장보고 성춘향 이몽룡

        list.set(0, "세종대왕"); //index 0번의 객체를 "세종대왕"으로 대체한다.
        //세종대왕 홍길동 장보고 성춘향 이몽룡

        String str2 = list.get(2); //index 2번의 객체를 얻는다.
        System.out.println("index[2]: " + str2);

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

        list.remove(1); //index 1번의 객체를 삭제
        list.remove("장보고"); //"장보고"객체를 삭제

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i + " : " + str);

        }
        System.out.println();

        list.clear(); //리스트 안에 저장된 모든 객체를 삭제

        System.out.println(list.isEmpty());
        //논리값으로 리스트 안이 비어있으면 true, 비어있지 않으면 false 반환
    }
}
