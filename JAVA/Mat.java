import java.util.Scanner;
class matrix
{
	int row,col;
	int[][] m =new int[20][20];
	void read()
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows:");
		row=s.nextInt();
		System.out.println("Enter the columns:");
		col=s.nextInt();
		System.out.println("Enter the elements");
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{
				this.m[i][j]=s.nextInt();
			}
		}
		
	}
	void display()
	{
		int i,j;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
class Mat
{
	public static matrix add(matrix a,matrix b)
	{
			int i,j;
			matrix m1=new matrix();
			m1.row=a.row;
			m1.col=a.col;
			for(i=1;i<=a.row;i++)
			{
				for(j=1;j<=a.col;j++)
				{
					m1.m[i][j]=a.m[i][j]+b.m[i][j];
				}
			}
		return m1;
	}
	public static void main(String arg[])
	{
		 matrix m1=new matrix();
		 matrix m2=new matrix();
		 m1.read();
		 m2.read();
		 System.out.println("First Matrix:");
		 m1.display();
		 System.out.println("Second Matrix:");
		 m2.display();
		 if(m1.r==m2.r && m1.c==m2.c)
		{
			 matrix m=new matrix();
			 System.out.println("Resultant Matrix:");
			 m=add(m1,m2);
			 m.display();
		 }
		 else
		{
				System.out.println("Addition not possible");
		}
	}
}
