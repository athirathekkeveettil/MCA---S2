class A
{
 int x=2;
 void show()
 {
  System.out.println("The value of x:"+x);
 }
}
class B extends A
{
 int y=4;
 void display()
 {
  System.out.println("The value of y:"+y);
 }
}

class inher
{
 public static void main(String args[])
 {
  B a=new B();
  a.show();
  a.display();
 }
}

