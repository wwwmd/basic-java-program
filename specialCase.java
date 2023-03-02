class parent{
 void college(){
    System.out.println("I am sandip university");
 }
 void branch(){
    System.out.println(" i am electrical engineering student ");
 }
}
class child extends parent{
   void branch(){
    System.out.println(" i am computer science engineering student");
   }
   void member(){
    System.out.println(" i have 56 memeber in family computer science engineering student ");
   }
}
class child1 extends parent{
     
    void branch(){
        System.out.println( " i am machanical engineering student ");
    }
    void member1(){
        System.out.println(" i have 26 member in family machanical engineering student ");

    }

}



public class specialCase {
   public static void main(String[] args) {
    child c =new child();
    c.college();
    c.branch();
    c.member();

    child1 c1 =new child1();
    c1.college();
    c1.branch();
    c1.member1();
    
   } 
}
