package javaS;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOTest {
    public static void main(String[] args) {
      //  WriteDate();
        ReadDate();


    }
    public static void ReadDate(){
        FileInputStream fileInputStream =null;
        try {
            byte bytes[] = new  byte[15];
           fileInputStream = new FileInputStream("/Users/macbook/IdeaProjects/java_js/text.txt");
           int readDate = 0;
           while ((readDate=fileInputStream.read(bytes)) != -1){
               System.out.println(new String(bytes ,0,readDate));
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }








    public static void WriteDate(){
        File file = new File("/Users/macbook/IdeaProjects/java_js/text.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String s = "hello";
        byte b[] = s.getBytes(StandardCharsets.UTF_8);
        FileOutputStream fileOutputStream = null;
        try {
             fileOutputStream = new FileOutputStream(file);
             fileOutputStream.write(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
