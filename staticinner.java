class A{
    public void show(){
        System.out.println("this is first static inner class");
    }
    static class B{
        public void disp(){
            System.out.println("this is static inner class2");
        }
    }
}



public class staticinner {
public static void main(String[] args) {
    A obj =new A();
    obj.show();
    A.B obj1=new A.B();
    obj1.disp();
}
}
