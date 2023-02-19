class A{
    void add(){
        int a= 10 ,  b=20, c ;
        c=a+b;
        System.out.println(" normal addition addition                       :-" + "  " +c );
    }
    void add(int x , int y)
    {
        int c;
        c=x+y;
        System.out.println("methode name same and diffirent parameter        :-" + "   "+c);

    }
    void add(int x, double y){
        double c;
        c = x+y;
        System.out.println("methode name same and diffirent parameter       :-" + "   " +c) ;
    }
}





public class polymorphism1 {
    public static void main(String args[]){
        
         A obj =new A();
         obj.add(50,100);
         obj.add(20,30.5);
           
         obj.add();

         
    }

}
