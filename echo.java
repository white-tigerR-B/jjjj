public class echo
{
     public static void main(String args[])
     {
         
        int jew[]= new int[10];
        int k[]= new int[10];
        int m=0;
    
        for(int i=0;i<=9;i++)
        {
            jew[i]=Integer.parseInt(args[i]);
            System.out.println( "the"+jew[i]);
          k[i]=jew[i]*jew[i];
         System.out.println("the square is "+k[i]);
           m= m+k[i];
         
        }
             System.out.println("the sum is "+m);
           

         
        
          
     }
}
