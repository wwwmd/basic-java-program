import java.util.Scanner;

public class maxiumvaluearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of arrays");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {


            int mx = arr[0];
            for (int j= 0; j < arr.length; j++)
                if (arr[j] > mx) {

                    mx = arr[j];

                }
            System.out.println("maximum value in array " + mx);
        }

    }
}
