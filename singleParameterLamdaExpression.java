interface A{
    public void show(int speed);
}



public class singleParameterLamdaExpression {
 public static void main(String[] args) {
    A obj=speed -> System.out.println("I am using single parameter lamda Expression Speed   :  "+speed +"KM");
    obj.show(40);
 }   
}
