package array;

public class Ex03 {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        //배열의 각 요소에 정수 100, 200, 300, 400, 500의 값을
        //인덱스를 통하여 저장하고 배열의 각 요소를 출력해보자

        intArray[0] = 100;
        intArray[1] = 200;
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500;

        for(int i = 0; i<5; i++){
            System.out.println(intArray[i]); //i: 제어변수
        }

        System.out.println("배열의 길이는? : " + intArray.length);
        //배열의 길이를 구하는 방법 >> 배열변수.lengh

        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
