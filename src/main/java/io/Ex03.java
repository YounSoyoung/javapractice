package io;

import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:" + File.separator + "aaa");
        File file = new File(dir, "aaa.txt");

        FileOutputStream fos = new FileOutputStream(file, true);
        //파일이 없으면 만든다.
        //객체 생성 시 true이면 이어쓰기, false이면 다시 쓰기

        ///fos.write(65);
        //아스키코드
        //fos.write('B');

        String msg = "Hello Java World";

        byte[] by = msg.getBytes();

        fos.write(by, 6, 4);

        fos.close();
    }
}
