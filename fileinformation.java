import java.io.File;

import java.io.*;

public class fileinformation {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\mdirs\\Desktop\\lc.txt");

        if(f.exists())
        {
            System.out.println("file name     :-   "+ f.getName());
            System.out.println("file location   :-   "+ f.getAbsolutePath());
            System.out.println("file readable     :-   "+ f.canRead());
            System.out.println("file writeable     :-   "+ f.canWrite());
            System.out.println("file length        :-    "+ f.length());
        }
        else{
            System.out.print("file does not exists...");
        }
    }
}
