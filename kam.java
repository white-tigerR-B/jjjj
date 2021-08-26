class kam {
    
    public static void main(String args[])
        {
            int marks[]=new int[10];
            for(int i=0;i<10;i++)
            {
                marks[i]=Integer.parseInt(args[i]);
                System.out.println("The marks of student is "+marks[i]);

            } 
            
           
            for(int i=0;i<10;i++)
            {
             if(marks[i]>30 && marks[i]<50)
             System.out.println("Student is pass "+marks[i]);
                
             
             else if(marks[i]<30)
             System.out.println("Student is fail   "+marks[i]);
             

             else if(marks[i]>55 && marks[i]<96)
             
             System.out.println("Studen got first divsion "+marks[i]);

             
             else if(marks[i]>96)
             
             System.out.println("Stdent got first position "+marks[i]);
             

            } 
            System.out.println();



        }
    

}
