
import java.util.*;
public class calculator {
    public static void main(String args[]){
    int sym,no1,no2 ,res;
    String yn;
    do{

    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter first number");
    no1=s.nextInt();
    System.out.println("Enter second two number");
    no2=s.nextInt();
    System.out.println("Select Your choice press (1. + ,  2. - , 3. * , 4. / , 5. % )");
    sym=s.nextInt();
   switch(sym){

    case  1:res=no1+no2;
    System.out.println("addition of two no :-  " +res);
    break;

    case 2: res=no1-no2;
    System.out.println("subtraction of two no :-  " +res);
    break;

    case 3: res=no1*no2;
    System.out.println("Multiplication of two no :-  " + res);
    break;

    case 4: res=no1/no2;
    System.out.println("Division of two no :-  " +res);
    break;

    case 5: res=no1%no2;
    System.out.println("Modulus of two no :-  " +res);
    break;

    default: System.out.println("invalid sign ");

   }
   System.out.println("do you want to continue press Y yes and N for no");
    
         yn=s.next();
    
     }while (yn.equals("y") || yn.equals("n"));
}
}