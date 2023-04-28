package io;

import java.io.File;

public class Ex01 {
    public static void main(String[] args) throws Exception{
        //try ~ catch 문으로 직접 작성할 것

        File file1 = new File("C:\\aaa\\aaa.txt");
        //파일이 없어도 상관없다.

        File file2 = new File("C:\\aaa", "aaa.txt");
        //파일 경로와 파일명으로 객체를 생성할 수 있다.

        File file3 = new File("C:\\aaa");
        //파일 경로(폴더)까지만 객체를 생성할 수 있다.

        File file4 = new File(file3, "aaa.txt");
        //파일 경로의 객체를 넣어서 만들 수 있다.

        //윈도우 폴더 구별자 : \
        //리눅스 폴더 구별자: /

        File dir = new File("C:" + File.separator + "aaa");
        //File.separator : 폴더구별자
        File file = new File(dir, "aaa.txt");
    }
}
