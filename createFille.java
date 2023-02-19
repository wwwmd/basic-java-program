


import java.io.*;
public  class createFille {
    public static void main(String[] args) 
    {
        File f=new File("C:\\Users\\mdirs\\Desktop\\learncodding.txt");
            try{
            if(f.createNewFile())
                {
                System.out.println("file is created...!");
        
                 }
                   else
                    {
                    System.out.println("file is already exists...!");
                    
                      }
                }
                  catch(IOException i)
                    {
                      System.out.println("file IOException occcured...!");
                      
                  }
        

    }
}


