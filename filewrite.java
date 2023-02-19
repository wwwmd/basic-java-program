import java.io.*;
public class filewrite
        
{
    public static void main(String[] args) 
    {
        try
            {
                FileWriter myWriter = new FileWriter("C:\\Users\\mdirs\\Desktop\\lc.txt");
            try
            {
                myWriter.write("java is high level language and onject orienter programing language it is use to develop website and software amd mobile application ");
            }
            finally
               {
                myWriter.close();
               }
             System.out.println("successfully data wrote in file..!");
             }
          catch(IOException i)
           {
            
            System.out.println(i );
            
             }
        
    }
}