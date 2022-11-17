package condition;

public class Ex02 {
    public static void main(String[] args) {
        //if문을 활용해서 A B C 등급으로 나누기
        //80점 미만이면 C등급
        //80 ~ 89점 사이면 B 등급
        //90~100점이면 A 등급
        int a = 85;

        if(90<=a){
            System.out.println("A등급입니다.");
        } else if (80 <= a && a < 90) {
            System.out.println("B등급입니다.");
        }else System.out.println("C등급입니다.");
    }
    //if문 만으로도 코드를 작성할 수 있다.
    //하지만 좀 더 편리하게 사용하기 위해 else가 나왔다.
}
