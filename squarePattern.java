import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of square pattern");

        int[] b=new int[sc.nextInt()] ;


        //int b []={1,5,4,5,6};

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                if (i==0||i==b.length-1||j==0||j==b.length-1){
                    System.out.print(" *");

                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }
}

