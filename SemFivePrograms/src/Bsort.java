class demo
{
       int a[];
       int n;
       public demo(String s[],int n)
        {
    	    this.n=n;
    	   	a=new int [n];
    	   	for(int i=0;i<s.length;i++)
    	   	{
    	   		a[i]=Integer.parseInt (s[i]);
    	   	}

        }
     void bs()
       {
         int i,j,temp;
         for(i=0;i<n;i++)	
          {
           for(j=0;j<n;j++)
            {
        	   if( a[j]>a[j+1] )
                 {
        		   temp=a[j];
        		   a[j]=a[j+1];
        		   a[j+1]=temp;
                }
           }
        }
    }
  

   void display(int no)
    {
     int i;
     for(i=0;i<no;i++)
      {
       System.out.println(a[i]);
      }
    }

}
class Bsort
{
  public static void main(String s[])
  {
   //int i;
   int n=s.length;
   demo x= new demo(s,n);
   x.bs();
   x.display(n);
  }
}