interface A{
    public void drive(int s, int p);
}



public class lamdaExpression {

   public static void main(String[] args) {
     A obj = ( s,p) -> System.out.println("you can drive speed "+s+" : "+p);
       

     
     obj.drive(16,40);
    
}
}
