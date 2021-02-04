package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    Created on 2020/11/20
    字节输出流：从内存写数据到硬盘，按照字节为单位
    实现类FileOutputStream类
*/
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:/test/fos.txt");
        //写一个字节到文件中去
        fos.write(97);
        //释放资源
        fos.close();
    }
}
