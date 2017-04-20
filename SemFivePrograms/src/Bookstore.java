class Book
{
double price;
String title;
   Book(String nm,double pr)
    {
     price=pr;
     title=nm;
    }
}

class Pub extends Book
{
String publ;
   Pub(String nm,double pr,String pu)
    {
     super(nm,pr);
     publ=pu;
    }

   void display()
   {
    System.out.println("book name => "+title);
    System.out.println("book price => "+price);
    System.out.println("book publication => "+publ);
   }
}

class Bookstore
{
 public static void main(String args[])
  {
   Pub x=new Pub("bade achche lagte hai",5000,"popular_lovestory_pub");
   x.display();
  }
}