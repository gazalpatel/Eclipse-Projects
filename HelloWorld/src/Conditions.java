import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Conditions 
{

	public static void main(String[] arg)
	{
		int a=5,b=10;
		String selection = "+";
		char selectChar;
		//DataInputStream dis = new DataInputStream(System.in);
		//int i = reader.readInt();
		
		Scanner reader = new Scanner(System.in);
		
		p("~~ Compare two numbers ~~");
		p("Enter First Number:");
		a = reader.nextInt();
		p("Enter Second Number: ");
		b = reader.nextInt();
		
		
		if(a>b)
		{
			p("a is greater than b");
		}
		else if(a<b)
		{
			p("b is greater than a");
		}
		else
		{
			p("both numbers are equal");
		}
		
		p("~~ Calculation of numbers ~~");
		p("Choose action: + - / %");
		//p("+");
		//p("-");
		//p("/");
		//p("%");
		
		selection = reader.next();
		selectChar = selection.charAt(0);
		
		switch (selectChar)
		{
			case '+':
				p("Answer is: " +String.valueOf(a+b));
				break;
			case '-':
				p("Answer is: " +String.valueOf(a-b));
				break;
			case '/':
				if(b != 0)
				{
					double ans= (double) a / (double) b;
					p("Answer is: " +String.valueOf( ans ));
				}
				else
				{
					p("Invalid Selection for given numbers");
				}
				break;
			case '%':
				if(b!=0)
				{
					double ans= (double) a % (double) b;
					p("Answer is: " +String.valueOf(ans));
				}
				else
				{
					p("Invalid Selection for given numbers");
				}
				break;
			default:
				p("Invalid answer");
				break;
		}
		p("~~ THE END ~~");
		
	}
	
	public static void p(String text)
	{
		System.out.println(text);
	}
}
