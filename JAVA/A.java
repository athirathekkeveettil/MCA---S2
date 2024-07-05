interface I1  
{
    public void data();
   
}

interface I2
{

  public void display();
   
}

class B implements I1,I2
{
    public void data ()
    {
        String name="Athira";
        int rollno=22;
        System.out.println(name);
        System.out.println(rollno);
    }
    public void display()
    {
      String name="Aswin";
      int rollno=21;
      System.out.println(name);
      System.out.println(rollno);
    }
}
public class A
{
    public static void main (String args [])
    {
        B h1= new B();
        h1.data();
        B h2=new B();
        h2.display();
    }
}
