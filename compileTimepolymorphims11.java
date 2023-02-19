public class compileTimepolymorphims11 {
    
        void show()
        {
    
            System.out.println("1");
        }
    
    }
    class test extends runTimePolymorphism{
    
        void show() {
            super.show();
            System.out.println("2");
        }
    
        public static void main(String[] args) {
    
            test t=new test();
            t.show();
        }
    }
    

