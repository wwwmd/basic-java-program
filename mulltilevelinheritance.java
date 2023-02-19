class multi{
    int a=10,b=20;
    void add(){
        int c;
        c=a+b;
        System.out.println("addition :-  "+c);
    }
    void sub(){
        int d;
        d=a-b;
        System.out.println("subtraction :-  "+d);
    }
}
class aple extends multi{
    void multiplication(){
    int g;
    g=a*b;
    System.out.println("multiplication :-  "+g);
}

}
class inhet extends aple{
    void div(){
        int f;
        f=a%b;
        System.out.println("division :-   "+f);
    }

}

public class mulltilevelinheritance { 
    public static void main (String args[])
    {
        inhet obj= new inhet();
        obj.add();
        obj.sub();
        obj.multiplication();
        obj.div();
    }
    
}
