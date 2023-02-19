public class stringreverse {
    public static void main(String[] args) {
        String str="hello md ehsan";
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
           str2= str2+str.charAt(i);
        }
        System.out.println("Befor string :"+str);
        System.out.println("After Reversing of String : "+str2);
    }
}
