package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    Created on 2020/11/20
*/
public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        //一次读写一个字节
        FileInputStream fis = new FileInputStream("D:/test/a.txt");
        FileOutputStream fos = new FileOutputStream("D:/test/b.txt");
        int ch = -1;
        while((ch=fis.read())!=-1){
            fos.write(ch);
        }
        fos.close();
        fis.close();
    }
}
