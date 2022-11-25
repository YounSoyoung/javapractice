package method;

public class Ex07 {
    public static int sum1(int... n){//매개값의 수를 모르는 경우
        int sum = 0;
        for(int i:n){
            sum += i;
        }
        return sum;
    }

    public static int sum2(int[] array){ //매개값을 배열로 받는 경우
        int sum = 0;

        for(int i : array){
            sum += i;
        }
        return sum;
    }

    public static void change1(int a){
        a = 100;
    }

    public static void change2(int[] array){
        array[0] = 100;
    }

    public static void main(String[] args) {
        int sum1 = sum1(1, 2, 3);
        System.out.println(sum1);

        int[] array = {1, 2, 3, 4, 5};

        int sum2 = sum2(array);
        System.out.println(sum2);

        int a = 1;
        change1(a);
        System.out.println(a);
        //1의 값을 복사해서 넘겼기 때문에 원본의 값은 바뀌지 않는다.

        change2(array);
        System.out.println(array[0]);
        //배열의 주소를 보냈기 때문에 배열의 값을 바꾸면 원본배열이 바뀐다.
    }
}
