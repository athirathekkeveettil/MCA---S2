import java.util.Scanner;
class std
{
void details()
{
 Scanner s=new Scanner(System.in);
 System.out.println("STUDENT DETAILS");
 System.out.println("Enter Roll Number:");
 int rno = s.nextInt();
 System.out.println("Enter Name:");
 String name;
 name=s.next();
 
 System.out.println("STUDENT DETAILS");
 System.out.println("Roll Number:"+rno);
 System.out.println("Name:"+name);
 }
}
 class student
 {
  public static void main(String args[])
  {
   std s=new std();
   try
   {
   s.details();
   }
   catch(Exception e)
   {
    System.out.println("Went Wrong!!");
   }
  }
 }
 
