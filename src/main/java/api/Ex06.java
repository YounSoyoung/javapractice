package api;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        //Arrays 클래스는 배열을 쓰는데 있어서 편리한 기능을 제공해주는 클래스
        //Math 클래스와 마찬가지로 static 메소드들로 구성되어있어
        //클래스로 편하게 접근 가능하다.

        int[] array = {1, 2, 3, 4, 5};

        String strArray = Arrays.toString(array);

        System.out.println(strArray);

        int[] array2 = Arrays.copyOf(array, 7);
        //배열 복사 copyOf(복사할 배열, 길이);
        //길이만큼 새로운 배열이 만들어지고 복사할 배열의 index의 0부터 복사된다.
        System.out.println(Arrays.toString(array2));

        int[] array3 = Arrays.copyOfRange(array, 2, 4);
        //index 2부터 3까지의 배열이 복사가 된다. (4는 불포함)
        System.out.println(Arrays.toString(array3));

        int[] array4 = {3, 6, 1, 4, 2, 5};
        System.out.println(Arrays.toString(array4));

        Arrays.sort(array4);
        //전달받은 배열의 모든 요소를 오름차순으로 정렬
        System.out.println(Arrays.toString(array4));
    }
}
