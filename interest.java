import java.util.Scanner;

 class simple {
    float pa;
    int rate =5;
    float time;
    float si;
    public void disp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total amount");
         pa=sc.nextInt();
        System.out.println("Enter the total time");
         time=sc.nextInt();

    }
    public void show(){
        si =pa*time*rate/100;
        
    }
    public void show1()
    {
        System.out.println("simple interest : "+si);
    }

    
}
public class interest{
public static void main(String[] args) {
    simple obj=new simple();
    obj.disp();
    obj.show();
    obj.show1();
}
}
