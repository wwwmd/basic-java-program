

 class a {
    public void show()
{
    System.out.println("this is inner calss ");
}
  class b{
    public void disp(){
        System.out.println("this is inner class 2");
    }
}
    
}

class innerclass{

    public static void main(String[] args) {
        a obj=new a();
          obj.show();
          a.b obj1=obj.new b();
          obj1.disp();

    }
}
