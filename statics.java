public class statics {
   
        int c=10;
        static int a =15;
        void show()
        {
            int b=20;
            System.out.println(a +"   "+c+"   "+b);
            ++a; ++b;
        }
            public static void main(String args[]){
            statics obj =new statics();
            obj.show();
            obj.show();
            obj.show();
        

    }
}
