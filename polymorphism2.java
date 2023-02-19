class mdehsan{
    void draw ()
    {
        System.out.println("cannot say this  draw shape");
    }
}
 class ehsan  extends mdehsan 
 {
    
    
    void draw(){
        System.out.println("draw this shape");
    }
}



public class polymorphism2 {
    public static void main(String args[]){
        mdehsan obj=new mdehsan();
        obj.draw();
        ehsan p=new ehsan();
        p.draw();
        

        

    }
}
