
interface A{
    public void dis();
}

public abstract class simpleLamda {
    public static void main(String[] args) {
       
       
       A obj3 = () -> System.out.println("i am using simple lamda expression in java");

       obj3.dis();
   
    }
}
