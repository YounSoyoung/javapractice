package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex07 {
    public static void main(String[] args) throws Exception{
        File dir = new File("C:" + File.separator + "aaa");
        File file = new File(dir, "aaa.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.print("안녕하세요");
        pw.println(20);
        pw.println("Java 감사합니다");

        pw.close();
        bw.close();
        fw.close();
    }
}
