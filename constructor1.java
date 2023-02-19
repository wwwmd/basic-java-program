class teacher{
    private String studentName;
    private int studentAge;
    
    public teacher(){
        this("shubham",66);
      System.out.println("i am a default constructor");
     studentName="mdehsan";
     studentAge=23;
    }
    public teacher(String studentName){
        this();
      System.out.println("i am a single constructor");
     this.studentName=studentName;
     studentAge=30;
    }
    public teacher(String studentName,int studentAge){
      System.out.println("i am double constructor");
     this.studentName=studentName;
     this.studentAge=studentAge;
    }
    public void disp(){
      System.out.println(studentName);
      System.out.println(studentAge);
    }
    }
    public class constructor1{
      public static void main(String[] args) {
        teacher tr=new teacher();
        tr.disp();
        teacher tr1=new teacher("amanat ali");
        tr1.disp();
       // teacher tr2=new teacher("surya",32);
        //tr2.disp();
      }
    }
