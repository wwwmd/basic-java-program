public class sortArr {
   

    public static void main(String[] args)
    {
            int a[]={1,0,30,20,60,15,6};
            for(int i=0;i<7;i++)
            {
               for(int j=i+0;j<7;j++){
                   if(a[i]>a[j]){
                       int temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
                   }
               }
            }
            for(int re:a){
                System.out.println(re);
        }
    }
}




