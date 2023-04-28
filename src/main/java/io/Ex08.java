package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex08 {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:" + File.separator + "aaa");
        File file = new File(dir, "aaa.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while (true){
            String msg = br.readLine();

            if(msg == null){ //text에서 파일의 끝은 null이다.
                break;
            }

            System.out.println(msg);
        }

        br.close();
        fr.close();
    }
}
