class student{
    private String name;
    private  int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   public void show(){
    System.out.println(name+"   "+age);
   }
}



public class encapsulation {
    public static void main(String[] args) {
        student st=new student();
        st.setName("md ehsan");
        st.setAge(23);
        System.out.println(" ");
        System.out.println("student name is : "+st.getName());
         System.out.println("student age is : "+ st.getAge());
        System.out.println(" ");
        student st1=new student();
        st1.setName("aman kumar");
        st1.setAge(25);
        System.out.println("student name is : "+st1.getName());
        System.out.println("student age is : "+ st1.getAge());

    }
}
