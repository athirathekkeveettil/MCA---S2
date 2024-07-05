import java.util.Scanner;
class Example
{
 int rollno;
 String name;
 float mark;
 
 void show()
 {
  System.out.println("Example For Non-Static Methods");
  System.out.println("\n STUDENT DETAILS\n");
  System.out.println("Name:"+name);
  System.out.println("Roll Number:"+rollno);
  System.out.println("Marks:"+mark);
 }
 
 static void show1()
 {
  System.out.println("Example For Static Methods");
 }
 public static void main(String args[])
 {
  try
  {
   Scanner s=new Scanner(System.in);
   Example a=new Example();
   System.out.println("Enter name:");
   a.name=s.next();
   System.out.println("Enter roll number:");
   a.rollno=s.nextInt();
   s.nextLine();
   System.out.println("Enter mark:");
   a.mark=s.nextFloat();
   a.show();
   show1();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
