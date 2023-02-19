public class stringpalindrome {
   public static void main(String[] args) {
    String str="585";
    String str2="";
    for(int i=str.length()-1;i>=0; i--)
    {
       str2=str2+str.charAt(i);
    }
    if(str.equals(str2))
    {

    
    System.out.println("This is palindrome String :- "+str2);
   } 
    else {

    System.out.println("This is no palindrone number "+str2);
   }
}
}