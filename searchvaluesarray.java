import java.util.Scanner;

public class searchvaluesarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the take elment and search in array");
        int n=sc.nextInt();

         int [] arr = {1,2,3,4,5,6,7,8};
        int x=n;
        int index=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
                index=arr[i];

        }
        //System.out.println("this element in arrray :"+index);
        if(index>0)
        {
            System.out.println("this element  in array"+index);
        }else{
            System.out.println("this element not in array"+index);
        }
    }
}
