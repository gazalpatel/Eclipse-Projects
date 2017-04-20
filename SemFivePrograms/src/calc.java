class calc
{
double ans;

double add(double a,double b)
{
 ans=a+b;
  return ans;
}

double sub(double a,double b)
{
 ans=a-b;
  return ans;
}

double mul(double a,double b)
{
 ans=a*b;
  return ans;
}

double div(double a,double b)
{
	if(b!=0)
	{	
 	ans=a/b;
	return ans;
	}
	else
	{
	System.out.println(" number is wrong");
	return 0.0;
	}

}
 
  public static void main(String a[])
     {	
	calc x=new calc();
	//calc y=new calc();

   	x.ans=x.add(10.0,5.0);
	System.out.println(" addition="+x.ans);
    
	x.ans=x.sub(10.0,5.0);
	System.out.println(" subtraction="+x.ans);	
	
	x.ans=x.mul(10.0,5.0);
	System.out.println(" multiplication="+x.ans);

	x.ans=x.div(10.0,5.0);
	System.out.println(" division="+x.ans);
     }
}