public class compileTimePolymorphism {
    void show(int a){
        System.out.println("single parameter");
    }
    void show(int a , int b){
        System.out.println("double parameter");
    }
    public static void main(String[] args) {
        compileTimePolymorphism r=new compileTimePolymorphism();
        r.show(20,30);

    }
}
