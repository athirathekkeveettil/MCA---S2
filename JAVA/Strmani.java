import java.util.Scanner;
class Strmani
{
  public static void main(String arg[])
  {
    String str[]=new String[20];
    String s="HELLO WORLD";
    System.out.println("Original String:"+s);
    System.out.println("Character at index 0:"+s.charAt(0));
    System.out.println("Substring from index 6:"+s.substring(6));
    System.out.println("String to uppercase:"+s.toUpperCase());
    System.out.println("String to lowercase:"+s.toLowerCase());
    System.out.println("Trim white spaces:"+s.trim());
    System.out.println("Index of letter W:"+s.indexOf("W"));
    System.out.println("Words after splitting:");
    str=s.trim().split("-");
		for(String i:str)
		{
			System.out.println(i);
		}
		System.out.println("Length : "+s.length());
		System.out.println("strings are equal:"+str.equals("hello"));
		System.out.println("after concatining:"+s.concat("!   Welcome"));
		System.out.println("replace Hello with Haii"+s.replace("Hello","Haii"));
	}
}
