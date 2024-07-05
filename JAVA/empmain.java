/*Create a class Employee having attributes eNo, eName eSalary. Read 'N' employ information and Search for an employee given eNo, using
the concept of Array of Objects*/

import java.util.Scanner;
class employee
{
	static int count=0;
	int eNo;
	String eName;
	Double eSalary;
	Scanner s=new Scanner(System.in);
	employee()
	{
		count++;
	}
	void getInfo()
	{
		System.out.println("Enter the details of employee "+ count);
		System.out.println("Enter the Name");
		eName=s.nextLine();
		System.out.println("Enter the eNo");
		eNo=s.nextInt();
		System.out.println("Enter the salary");
		eSalary=s.nextDouble();
	}
}
class empmain
{
	public static void main(String arg[])
	{
		
		employee e[]=new employee[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of employees");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			e[i]=new employee();
			e[i].getInfo(); 
		}
		System.out.println("Enter the employee's number to be searched");
		int num=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(e[i].eNo==num)
			{
				System.out.println("Employee's name is "+e[i].eName);
			}
		}
	}
}
