/*Create a class CPU with attribute price. Create an inner class Processor (no. of cores, manufacturer) and a static nested class RAM (memory,
manufacturer). Create an object of CPU and print information of Processor and RAM.*/


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
void display1()
{
  System.out.println("Price:"+this.price);
}
}

class c1
{ 
  public static void main(String args[])
  {
    CPU c=new CPU(100);
    c.display();
    CPU.processor p=c.new processor(22,"Athira");
		p.display();
		CPU.ram r=new CPU.ram("2GB","Delwin");
		r.display1();
	}
  }

