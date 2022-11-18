package loop;

public class Ex15 {
    public static void main(String[] args) {
        //continue문
//        for(int i=0; i<10; i++){
//            if(i==5){
//                continue;
//                //continue가 실행되면 아래에 있는 System.out.println(i);을 실행하지 않고
//                //바로 증감식(i++)으로 이동하여 실행된다.
//                //그러므로 5 빼고 출력된다.
//            }
//            System.out.println(i);

            int a = 0;
            while(a<10){
                a++;

                if(a==5){
                    continue;
                }
                System.out.println(a);
            }
        }
}
