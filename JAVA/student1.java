import java.util.Scanner;
class dk{
void detail(){
 
Scanner d=new Scanner(System.in);
System.out.println("student details");
System.out.println("enter roll no:");
int rolln=d.nextInt();
d.nextLine();
 
 
System.out.println("enter the name of student");
String name=d.next();
System.out.println("student details");
System.out.println("the roll no of student is" +rolln);
System.out.println("the name of the student is" +name);
}
}
class student1{
public static void main(String args[]){

dk d=new dk();
d.detail();

}
}
