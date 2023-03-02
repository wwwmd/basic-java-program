class parent1{
   String name="mdehsan";
   int age = 23;
   void disp()
   {
    System.out.println(name);
    System.out.println(age);
   } 
}
class child extends parent1{

}
class child1 extends child{

}


public class multilevelInheritance {
    public static void main(String[] args) {
        child1 c=new child1();
        c.disp();
        
    }
}
