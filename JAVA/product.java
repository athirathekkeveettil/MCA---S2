import java.util.Scanner;
class pro
{
 int pcode;
 String pname;
 float price;
 Scanner s=new Scanner(System.in);
 void get()
 {
 
 System.out.println("COMPARISON");
 System.out.println("Enter Product id:");
 int pcode = s.nextInt();
 System.out.println("Enter Product Name:");
 String name =s.next();
 System.out.println("Enter Price:");
 float price=s.nextFloat();
 }

 void display()
 {
 System.out.println("Product Id:"+pcode);
 System.out.println("Product Name:"+pname);
 System.out.println("Price:"+price);
 }
 
}

class product
{
 public static void main(String args[])
 {
  pro p1=new pro();
  pro p2=new pro();
  pro p3=new pro();
  p1.get();
  p2.get();
  p3.get();
  p1.display();
  p2.display();
  p3.sdisplay();
  }
}
 

