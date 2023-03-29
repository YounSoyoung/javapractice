package interface1;

import java.util.Scanner;

class IronMan {
    IronSuit ironSuit;

    public IronMan(){
        ironSuit = new NormalIronSuit();
    }

    public void fight(IronSuit ironSuit){
        ironSuit.attack();

        if(ironSuit instanceof NewIronSuit){
            NewIronSuit newIronSuit = (NewIronSuit)ironSuit;
            newIronSuit.laserBeamAttack();
        }
    }
}

interface IronSuit {
    public void flying();
    public void attack();
}

class NormalIronSuit implements IronSuit{
    String suitName = "마크1";

    @Override
    public void flying(){
        System.out.println("아이언맨이 " + suitName + "을 장착하고 날아갑니다.");
    }

    @Override
    public void attack(){
        System.out.println(suitName + "을 장착한 아이언맨이 적을 향해 공격합니다.");
    }
}

class NewIronSuit implements IronSuit {
    String suitName = "마크43";

    @Override
    public void flying(){
        System.out.println("아이언맨이 " + suitName + "을 장착하고 날아갑니다.");
    }

    @Override
    public void attack(){
        System.out.println(suitName + "을 장착한 아이언맨이 적을 향해 공격합니다.");
    }

    public void laserBeamAttack(){
        System.out.println(suitName + "을 장착한 아이언맨이 레이저빔을 쏩니다.");
    }

}

public class Ex06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        IronMan ironMan = new IronMan();
        System.out.println("1. 마크1 2. 마크43");

        int choice = scan.nextInt();

        if(choice == 1){
            ironMan.ironSuit = new NormalIronSuit(); //필드의 다형성
            ironMan.ironSuit.flying();

            NormalIronSuit ironSuit1 = new NormalIronSuit();

            ironMan.fight(ironSuit1); //매개변수의 다형성

        }else if(choice == 2){
            ironMan.ironSuit = new NewIronSuit();//필드의 다형성
            ironMan.ironSuit.flying();

            NewIronSuit ironSuit2 = new NewIronSuit();
            ironMan.fight(ironSuit2); //매개변수의 다형성
        }else {
            System.out.println("잘못입력 하였습니다.");
        }
    }
}
