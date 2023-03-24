package abstraction;

import java.util.Scanner;

class Food {
    String foodName;
    int foodScore;

    public Food(String foodName, int foodScore){
        this.foodName = foodName;
        this.foodScore = foodScore;
    }
}

abstract class FoodService {
    public abstract Food[] insertFood();
    public abstract void foodList(Food[] food);
}

class FoodServiceView extends FoodService{
    Scanner scan = new Scanner(System.in);

    //오늘 먹은 음식 수를 정수로 받아서
    //음식 수만큼 Food 배열을 생성 후 반복문으로
    //먹은 음식수만큼의 음식이름과 음식평점을 받은 후에
    //Food 객체를 생성 후 배열의 각 요소에 저장하기
    //Food 객체를 반환하기

    @Override
    public Food[] insertFood(){
        System.out.print("오늘 먹은 음식의 수는: ");
        int foodSu = scan.nextInt();
        Food[] myFood = new Food[foodSu];

        for(int i = 0; i<foodSu; i++){
            System.out.print(i+1+"번째 먹은 음식 이름: ");
            String foodName = scan.next();
            System.out.println(i+1+"번째 먹은 음식의 점수: ");
            int foodScore = scan.nextInt();
            myFood[i] = new Food(foodName, foodScore);
        }
        return myFood;
    }

    //Food 배열을 매개변수로 받아서
    //배열 안의 Food 객체 안의 음식이름과 음식 평점 출력하기
    @Override
    public void foodList(Food[] food){
        for(int i=0; i<food.length; i++){
            System.out.println(i+1+"번째 먹은 음식은 " + food[i].foodName + "이고 점수는 " + food[i].foodScore + "점 입니다.");
        }
    }

}

public class Ex03 {
    public static void main(String[] args) {
        FoodService service = new FoodServiceView();
        Food[] myFood = service.insertFood();

        service.foodList(myFood);
    }
}
