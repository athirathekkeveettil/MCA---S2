/*Create a class CPU with attribute price. Create an inner class Processor (no. of cores, manufacturer) and a static nested class RAM (memory,
manufacturer). Create an object of CPU and print information of Processor and RAM.*/

import java.util.Scanner;
class CPU
{
 int price;
 CPU(int x)
 {
  this.price=x;
 }
 class Processor
 {
  int cores;
  String manufacture;
  Processor(int a,String b)
  {
   this.cores=a;
   this.manufacture=b;
  }
  void display()
  {
    System.out.println("No. of cores="+this.cores);
    System.out.println("Manufacture="+this.manufacture);
  }
 }
 static class RAM
 {
  int memory;
  String manufacture;
  RAM(int a,String b)
  {
   this.memory=a;
   this.manufacture=b;
  }
  void display()
  {
   System.out.println("Memory:"+this.memory);
   System.out.println("Manufacture:"+this.manufacture);
  }
 }
void display()
{
  System.out.println("Price:"+this.price);
}

 public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the price:");
    int price=sc.nextInt();
    System.out.println("Enter the number of cores:");
    int cores=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the name of manufacture of Processor:");
    String manufacture=sc.nextLine();
    System.out.println("Enter the size of memory:");
    int memory=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the name of manufacture of RAM:");
    String RAM manufacture=sc.nextLine();
    CPU c=new CPU(price);
    c.display();
    CPU.processor p=c.new processor(cores,manufacture);
    p.display();
    CPU.RAM r=new CPU.RAM(memory,manufacture);
    r.display();
	}
}

