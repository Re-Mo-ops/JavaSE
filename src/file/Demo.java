package file;

import java.io.File;

/*
    Created on 2020/11/20
    file类:封装系统中的文件和文件夹
*/
public class Demo {
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("D:/hello.txt");
        File file1 = new File("D:/","Hello.txt");
        File file2 = new File("D:/");
        System.out.println(file.length());
        System.out.println(file.getPath());
    }
}
