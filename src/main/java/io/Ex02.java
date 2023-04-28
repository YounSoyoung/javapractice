package io;

import java.io.File;

public class Ex02 {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:" + File.separator + "aaa");
        File file = new File(dir, "aaa.txt");

        if(file.createNewFile()){
            //파일이 없으면 파일 생성 후 true 반환
            //파일이 있으면 false 반환
            System.out.println("aaa.txt 파일을 생성 중");
        }else {
            System.out.println("aaa.txt 파일은 이미 존재합니다.");
        }

        File imsi = File.createTempFile("java", ".dat", dir);
        //임시 파일은 앞에 이름을 정하고 중간에 임의의 숫자가 들어간다.
        //뒤에 이름을 정한다. (보통 확장자를 쓴다.)

        imsi.deleteOnExit();
        //프로그램 끝날 때 삭제된다.

        Thread.sleep(5000);
        //프로그램을 5초간 잠재운다.

        file.delete();
        //바로 삭제

//        Thread.sleep(5000);
    }
}
