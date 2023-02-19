import java.util.*;

public class naturanumber {
    public static void main(String args[]){
        int n;
        System.out.println("Enter any number");
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i+ "  ");
        }
    }
}
