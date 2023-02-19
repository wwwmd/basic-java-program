

import java.util.*;


public class oddeven {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter any Number");
        Scanner obj =new Scanner(System.in);
        n=obj.nextInt();
        if(n%2==0){
            System.out.println("even Number");
        }else {
            System.out.println("odd Number");
        }

    }
}
