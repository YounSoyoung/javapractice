package array;

public class Ex12 {
    public static void main(String[] args) {
        int[] engScores = {68, 83, 77, 98, 100};

        for(int eng : engScores){
            System.out.print(eng + " ");
        }
        System.out.println();

        //학생이 2명 더 늘어났다면...

        int[] newEngScores = new int[7];

        for(int i=0; i<engScores.length; i++){
            newEngScores[i] = engScores[i];
        }

        for(int newEng : newEngScores){
            System.out.print(newEng + " ");
        }
    }
}
