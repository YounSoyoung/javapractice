package api;

//Member 클래스를 만든다.
//필드는 String name, int age; String tel;이다.
//생성자의 매개값으로 필드 초기화를 해준다.
//equals, hashCode, toString 메소드를 오버라이딩하여 재정의해준다.

class Member {
    String name;
    int age;
    String tel;

    public Member(String name, int age, String tel){
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;

            boolean bool = this.name.equals(member.name) && this.age == member.age
                    && this.tel.equals(member.tel);
            return bool;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return (name + age + tel).hashCode();
    }

    @Override
    public String toString(){
        return "이름: " + name + "\n나이: " + age + "\n전화번호: " + tel;
    }

}

public class Ex02 {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", 20, "010-1111-1111");
        Member member2 = new Member("홍길동", 20, "010-1111-2222");
        Member member3 = new Member("홍길동", 20, "010-1111-1111");

        System.out.println(member1.equals(member2));
        System.out.println(member1.equals(member3));

        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
        System.out.println(member3.hashCode());

        System.out.println(member1.toString());
    }
}
