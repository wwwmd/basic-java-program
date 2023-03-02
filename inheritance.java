class parent{
    int age=23;
    void disp(){
    System.out.println("hello i am first inheritance program");
    System.out.println(age);
    }
}
class child extends parent{

}


public class inheritance {
    public static void main(String[] args) {
        child c=new child();
        c.disp();
        
    }
}
