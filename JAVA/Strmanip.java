import java.util.Scanner;
class Strmanip
{
	public static void main(String arg[])
	{
	        String str[]=new String[40];
		String s = "Hii Athira";
		System.out.println("Original string:"+s);
		System.out.println("Character at index 0:"+s.charAt(0));
		System.out.println("Substring from index 6:"+s.substring(6));
		System.out.println("String to uppercase:"+s.toUpperCase());
		System.out.println("String to lowercase:"+s.toLowerCase());
		System.out.println("Trim white spaces:"+s.trim());
		System.out.println("Index of letter H:"+s.indexOf("H"));
		System.out.println("Words after splitting:");
		str=s.trim().split("-");
		for(String i:str)
		{
			System.out.println(i);
		}
		System.out.println("Length : "+s.length());
		System.out.println("Strings are equal:"+str.equals("hello"));
		System.out.println("After concatining:"+s.concat("! Welcome"));
		System.out.println("Replace Hii with Haii:"+s.replace("Hii","Haii"));
	}
}
