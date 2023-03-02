import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        int  sem=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total subject ");
       
        int  arr[]=new int[sc.nextInt()];
         for(int i=0;i<arr.length; i++){
          System.out.println("Enter subject number  : ");
             arr[i]=sc.nextInt();

    }

    for(int j=0;j<arr.length; j++ ){
        
        
        sem+=arr[j];
       
        
    }
        
     System.out.println(" total subject number "+sem);
     float result=sem/5;
     
     System.out.println("Total percentage  :  "+result);
}
}



