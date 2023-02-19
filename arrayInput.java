import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("size of arrays :");
        int n=sc.nextInt();
        System.out.println("enter array element are :");
        int arr[] =new int[n];
       for(int i=0;i<n;i++)

        {

            arr[i]=sc.nextInt();

        }
        System.out.println("array element are :");
        for (int i=0;i<n ;i++){
            System.out.println(arr[i]);

        }

    }
}