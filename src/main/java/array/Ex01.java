package array;

public class Ex01 {
    public static void main(String[] args) {
        int[] intArray1 = {10, 20, 30};
        //실제 값을 알고 있을 때
        //선언과 동시에 배열을 생성하면 new 연산자 생략 가능

        System.out.println(intArray1[0]);
        System.out.println(intArray1[1]);
        System.out.println(intArray1[2]);
        //배열 사용은 [] 안에 인덱스를 통해서 사용한다

        int[] intArray2 = null;
        //실제 값과 길이를 나중에 넣을 때 배열변수는 null 값으로 초기화할 수 있다.

        intArray2 = new int[]{1,2,3};
        //배열변수를 이미 선언한 후에는 반드시 new 연산자로 배열생성을 한다.

        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);

        int[] intArray3 = new int[3]; //저장할 값의 길이만 지정할 때

        intArray3[0] = 4;
        intArray3[1] = 5;
        intArray3[2] = 6;

        System.out.println(intArray3[0]);
        System.out.println(intArray3[1]);
        System.out.println(intArray3[2]);
    }
}
