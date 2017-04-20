class prime2
{
   public static void main(String a[])
     {
      int i,flag=0,k,no,j;
   no= Integer.parseInt(a[0]);
System.out.println(" number is prime numbers:");
    for(j=1;j<no;j++)
     {
     for(i=2;i<j;i++)
            {
               k = j%i;
   	if(k==0)
             	{
              	    flag=1;
	    break;
              	}
	else
	{
		flag=0;
	}
             }
	if(flag==0)
	System.out.println(+j);
	
        }
      }
}