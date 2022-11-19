package array;

public class Ex04 {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50, 60};
        //for문을 사용해서 배열의 전체 요소를 출력하기
        //index가 3인 곳은 출력하지 말고 나머지만 출력하기

        for(int i = 0; i<intArray.length; i++){
            if(i!=3) {
                System.out.println("intArray[" + i + "]: " + intArray[i]);
            }
        }
    }
}
