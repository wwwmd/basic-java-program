
class md{
     void show(){
        System.out.println("mdehsanai");
     }
}
class ehsan extends md{
    void set(){
        System.out.println("amanatali");
    }
}


public class singleinheritance {
    public static void main(String args[]){

    
    ehsan obj=new ehsan();
    
    obj.show();
    obj.set();
 
}
}