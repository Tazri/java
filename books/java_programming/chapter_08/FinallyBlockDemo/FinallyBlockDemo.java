package books.java_programming.chapter_08.FinallyBlockDemo;

import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockDemo {
    public void readFile(String filePath){
        FileReader reader = null;

        try{
            reader = new FileReader(filePath);
            int i = 0;

            while(i != -1){
                i = reader.read();
                System.out.println((char) i);
            }
        }catch(IOException e){
            System.out.println(filePath + " doesn't exist. Please enter a valid filePath.");
        }finally{
            if(reader != null){
                try{
                    reader.close();
                }catch(IOException e){
                    System.out.println("We couldn't close the resources");
                }
            }
        }
    }
}
