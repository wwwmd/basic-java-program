public class stringarr2 {
    public static void main(String[] args) {
        String str1="java mdehsan ali ";
        String str2="";
        String arr[] =str1.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        { 
            str2=str2+arr[i] + " ";

        }
             System.out.println(str2);
    }
}
