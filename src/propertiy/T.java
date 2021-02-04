package propertiy;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    Created on 2020/11/20
*/
public class T {
    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("Demo.java");
        FileOutputStream fos = new FileOutputStream("Demo1.java");
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
