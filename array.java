import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
       // int n=sc.nextInt();
    int arr[]=new int[sc.nextInt()];
    for(int i=0;i<arr.length; i++){
      System.out.println("Enter the array element ");
      arr[i]=sc.nextInt();
    }

    for(int j=0;j<arr.length; j++ ){
        System.out.print("Array Element are  : ");
        System.out.println(arr[j]);
        
    }
    System.out.println(" ");
}
}