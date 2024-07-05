import java.util.Scanner;
class con
{
  int a;
  String b;
 
  con()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Number:");
   a=s.nextInt();
   
  }
void display()
{
 System.out.println("Value:"+a);
}
}
class exmp()
{
 public static void main(String args[])
 {
  con c1=new con();
  //con c2=new con(3);
  //con c3=new con(2,"Hello");
  //System.out.println("value:"+)
  c1.display();
 }
}

