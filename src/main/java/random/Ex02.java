package random;

public class Ex02 {
    public static void main(String[] args) {
        //로또범위 뽑기
        //1~45 사이의 정수를 6개 뽑기

        int[] lotto = new int[6];

        //for문과 Math.random()을 사용해서 로또 번호를 뽑아
        //배열의 각 요소에 저장하기

        for(int i=0; i<6; i++){
            lotto[i] = (int)(Math.random()*45) + 1;

            for(int j=0; j<i; j++){ //j는 i의 아랫수까지만 반복
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }

        for(int i=0; i<6; i++){
            System.out.print(lotto[i] + " ");
        }
    }
}
