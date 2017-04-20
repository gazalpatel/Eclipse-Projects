class prime1
{
   public static void main(String a[])
     {
      int i,flag=0,k,no;
      no= Integer.parseInt(a[0]);
    
      for(i=2;i<no;i++)
            {
               k = no%i;
   	if(k==0)
             	{
              	    flag=1;
              	    break;
             	}
             }
	if(flag==0)
	System.out.println(" number is prime number");
	else
	System.out.println(" number is not prime number");
      }
}