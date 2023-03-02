

class parent{
    String name="md ehsan ";
    int age = 23;
    String college="Sandip university";
    
    
}

class child extends parent {
void disp(){
    System.out.println("i am child claass ");
    System.out.println(name);
    System.out.println(age);
    System.out.println(college);
}
}

class child1 extends parent{
    void show(){
    System.out.println("i am child1 claass ");
    System.out.println(name);
    System.out.println(age);
    System.out.println(college);
}

}


public class hirarchyInheritance {
    public static void main(String[] args) {
        child c=new child();
        c.disp();

        child1 c1 =new child1();
        c1.show();
    }
}
