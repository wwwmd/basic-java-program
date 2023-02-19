
import java.util.Scanner;

public class factorial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int number=5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.println("factorial number is :" + fact);
        }
    }
}
