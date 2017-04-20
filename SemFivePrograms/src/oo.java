class spr
{
	double l,b,a;
	void area(double l)
	{
	a=l*l;
	}

	void area(double l,double b)
	{
	a=l*b;
	}

	void display()
	{
	System.out.println(" area => "+a);	
	}
}

class sub extends spr 
{
double r;
	void area(double R)
	{
	super.area(R);
	super.display();
	a=(3.14 * R * R);
	}

	void display()
	{
	super.display();
	System.out.println("end");
	}
}

class oo
{
public static void main(String arg[])
 {
sub x=new sub();
x.area(10.0);
x.display();
x.area(5,2);
x.display();


 }
}
