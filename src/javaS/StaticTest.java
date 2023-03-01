package javaS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class StaticTest {
    public static void main(String[] args) {

//add content at the end of file; cherry up !!!
        BufferedWriter out =null;
        try {
            out = new BufferedWriter(new FileWriter("text.txt", true));
            out.write("astring");
        } catch (IOException e) {
            //error processing code
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }






}
