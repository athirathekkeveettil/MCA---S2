import java.util.Scanner;
interface i
{
	void get();
	void area();
	void perimeter();
}
class circle implements i
{
	int r;
	public void get()
	{
		System.out.println("Enter the radius:");
		Scanner s =new Scanner(System.in);
		r=s.nextInt();
	}
	public void area()
	{
		System.out.println("Area of circle:"+3.14*r*r);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of circle:"+2*3.14*r);
	}
}
class rectangle implements i
{
	int l,b;
	public void get()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter length:");
		l=s.nextInt();
		System.out.println("Enter breadth:");
		b=s.nextInt();
	}
	public void area()
	{
		System.out.println("Area of rectangle:"+l*b);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle:"+2*(l+b));
	}	
}
class AreaPeri
{
	public static void main(String arg[])
	{
		circle c=new circle();
		rectangle r=new rectangle();
		int ch;
		Scanner s =new Scanner(System.in);
		c.get();
		r.get();
		while(true)
		{
			System.out.println("menu\n1.Area of circle\n2.Perimeter of circle\n3.Area of rectangle\n4.Perimeter of rectangle\n5.exit\nenter your choice:");
			ch=s.nextInt();
			switch(ch)
			{
			        case 1:{
						c.area();
						break;
					     }
			        case 2:{
						c.perimeter();
						break;
					     }
			        case 3:{
						r.area();
						break;
					     }
			        case 4:{
						r.perimeter();
						break;
					     }
			        case 5:{
			                        System.out.println("EXIT");
						return;
					     }
			}
		}
	}
}
