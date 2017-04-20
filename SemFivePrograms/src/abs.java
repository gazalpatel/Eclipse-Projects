 abstract class shap
{
	double a,b,c;
	abstract void area();
}
class shap1 extends shap
{
	shap1(double x,double y)
	{
		a=x; b=y;
	}
	void area()
	{
		c=a*b;
		System.out.println("area of rect :"+c);
	}
}
class shap2 extends shap
{
	shap2(double x)
	{
		a=x; 
	}
	void area()
	{
		c=a*a;
		System.out.println("area of square :"+c);
	}
}
class abs
{
	public static void main(String arga[])
	{
		shap1 s=new shap1(12,5);
		s.area();
		shap2 s1=new shap2(5);
		s1.area();
	}
}
	