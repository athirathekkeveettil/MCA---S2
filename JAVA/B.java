interface rectangle{
    public void display();
    public void area();
    
  
}
interface square{
  public void display();
  public void perimeter();
  
  
}

class A implements rectangle,square{

  public void display()
  {
    System.out.println("Area and perimeter");
  }

  public void area() {
    int a=10;
    int b=10;
   System.out.println("Area:"+a*b);
   
  }
  public void perimeter() {
    int a=10;
    int b=10;
    System.out.println("Perimeter:"+ (a+b));
  }
  
 }
 
 public class B
{
    public static void main (String args [])
    {
        A h1= new A();
        h1.display();
        h1.area();
        h1.perimeter();
        
    }
}

