package handwrittencode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream  = null;
        try {
             fileInputStream = new FileInputStream("text.txt");
           // int read = fileInputStream.read();
            System.out.println("总字节数："+fileInputStream.available());
            fileInputStream.skip(3);
            byte[] bytes = new byte[fileInputStream.available()];
            int count = fileInputStream.read(bytes);
            System.out.println("count:"+count);

            System.out.println(new String(bytes));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
