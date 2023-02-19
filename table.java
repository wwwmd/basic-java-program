import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter the number of table ");
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int num=1;
        for (int i=1;i<=10;i++)

        {

            for (int j=2;j<=k; j++){
                num=i*j;

                System.out.print(num+"   ");

            }
            System.out.println();
        }


    }
}
