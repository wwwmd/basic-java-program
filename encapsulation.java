 class md {
    private int age;
   private String name;
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}


}
public class encapsulation {
public static void main(String[] args) {
    md obj=new md();
    md obj1=new md();
    obj.setAge(18);
    obj1.setAge(25);
    obj.setName("hello");
    obj1.setName("ehsan");
    
    int stdAge=obj.getAge();
    int stdAge1=obj1.getAge();
    System.out.println(stdAge);
    System.out.println(stdAge1);


}
    
}

