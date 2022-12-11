package pack1;

public class ConstructorEx {
    public ConstructorEx(){
        System.out.println("public 생성자");
    }

    protected ConstructorEx(int a){
        System.out.println("protected 생성자");
    }

    ConstructorEx(int a, int b){
        System.out.println("default 생성자");
    }

    private ConstructorEx(int a, int b, int c){
        System.out.println("private 생성자");
    }

    public static void main(String[] args) {
        // 같은 클래스 내부에서는 모두 호출 가능
        ConstructorEx ex1 = new ConstructorEx();
        ConstructorEx ex2 = new ConstructorEx(1);
        ConstructorEx ex3 = new ConstructorEx(1, 2);
        ConstructorEx ex4 = new ConstructorEx(1, 2, 3);
    }
}
