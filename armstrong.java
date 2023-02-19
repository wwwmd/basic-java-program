public class armstrong {
    public static void main(String[] args) {
        int num1=152,number,temp,total=0;
        number=num1;
        while(number!=0)
        {
            temp=number%10;
            total = total+temp*temp*temp;
            number/=10;
        }
        if (total ==num1)
        {
            System.out.println(num1+    "this is armstrong numner ");
        }else{
            System.out.println(num1+     "this is not armstrong number");
        }
    }
}
