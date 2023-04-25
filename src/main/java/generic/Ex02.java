package generic;

class Box<E>{
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj(){
        return obj;
    }
}

public class Ex02 {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj("안녕하세요");
//
//        String str = (String)box.getObj();
//        System.out.println(str);

        Box<String> myBox = new Box<String>();

        myBox.setObj("안녕하세요~!");

        String str = myBox.getObj();
        System.out.println(str);
    }
}
