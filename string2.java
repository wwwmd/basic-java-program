public class string2 {
    public static void main(String[] args) {
        String str1="md ehsan ali";
        String str2="";
     String arr[]=str1.split("  ");
         for (String rev : arr) {
            
         
        for(int i=rev.length()-1; i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        str2=str2+" ";
    }
        System.out.println("Before reversing of String : "+str1);
        System.out.println("After reversing of String  : "+str2);
    }
}
