package program;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{

    private ArrayList<Member> list = new ArrayList<>();

    private Scanner scan = new Scanner(System.in);

    @Override
    public void list() {
        //회원 목록 출력
        for(int i = 0; i < list.size(); i++){
            Member member = list.get(i);
            member.memberList();
        }
    }

    @Override
    public void view() {
        //이름을 입력받아 회원의 나이와 전화번호 출력
        System.out.print("조회할 회원의 이름 입력: ");
        String name = scan.next();

        for(int i = 0; i < list.size(); i++){
            Member view = list.get(i);
            if(view.getName().equals(name)){
                System.out.println(name + "님의 나이는: " + view.getAge() + "살");
                System.out.println(name + "님의 전화번호는: " + view.getPhoneNum() + "입니다.");
                return;
            }
        }
        System.out.println(name + "님은 저희 회원이 아닙니다.");
    }

    @Override
    public void insert() {
        //이름 나이 전화번호를 입력받아 회원 등록
        System.out.print("이름을 입력: ");
        String name = scan.next();
        System.out.print("나이를 입력: ");
        int age = scan.nextInt();
        System.out.print("전화번호 입력: ");
        String phoneNum = scan.next();

        list.add(new Member(name, age, phoneNum));
    }

    @Override
    public void edit() {
        //이름을 입력받아 회원의 나이와 전화번호 수정
        System.out.print("수정할 회원의 이름을 입력: ");
        String name = scan.next();

        for(int i = 0; i < list.size(); i++){
            Member edit = list.get(i);
            if(edit.getName().equals(name)){
                System.out.print("수정할 나이를 입력: ");
                int newAge = scan.nextInt();
                System.out.print("수정할 전화번호 입력: ");
                String newPhoneNum = scan.next();

                edit.setAge(newAge);
                edit.setPhoneNum(newPhoneNum);

                System.out.println(name + "님의 나이와 전화번호를 수정하였습니다.");
                return;
            }
        }
        System.out.println(name + "님은 저희 회원이 아닙니다.");
    }

    @Override
    public void delete() {
        //이름을 입력받아 회원 삭제
        System.out.print("삭제할 회원의 이름을 입력: ");
        String name = scan.next();

        for(int i = 0; i < list.size(); i++){
            Member delete = list.get(i);
            if(delete.getName().equals(name)){
                list.remove(i);
                System.out.println(name + "회원을 삭제하였습니다.");
            }
        }
        System.out.println(name + "님은 저희 회원이 아닙니다");
    }
}
