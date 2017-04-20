abstract class Shape
{
  double a,l;
 Shape(double x)
  {
  l=x;
  }
  abstract void area();
   
}

class Rect extends Shape
{
double b;
 Rect(double le,double br)
  {
   super(le);
   b=br;
  } 
void area()
    {
     a=l*b;
    System.out.println("area of Rectangle => " +a);
    }
 
}

class Square extends Shape
{
  Square(double length)
   {
    super(length);
   }
void area()
    {
     a=l*l;
    System.out.println("area of square => "+a);
    }

}

class Abstrct
{
 public static void main(String a[])
  {
  Rect r=new Rect(5,10);
  Square s=new Square(5);
  r.area();
  s.area(); 
  }
}