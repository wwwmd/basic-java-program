
interface A{
public void show();
}
public class annoumsinner {
   public static void main(String[] args) {
    A obj=new A(){
        public void show(){
            System.out.println("hello I am driving the car ");
        }
        
    };
    obj.show();
   } 
}
