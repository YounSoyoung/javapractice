package modifier;

class Box {
    static int boxID = 0;
    int idNum = 0;

    public void increase(){
        boxID++;
        idNum++;
    }
}

public class Ex02 {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.increase();
        System.out.println("boxID: " + box1.boxID);
        System.out.println("idNum: " + box1.idNum);
        System.out.println();

        box2.increase();
        System.out.println("boxID: " + box2.boxID);
        System.out.println("idNum: " + box2.idNum);
        System.out.println();

        box3.increase();
        System.out.println("boxID: " + box3.boxID);
        System.out.println("idNum: " + box3.idNum);
        System.out.println();

        //정적필드는 원칙적으로 클래스명으로 접근
        System.out.println("boxID는 : " + Box.boxID);
    }

}
