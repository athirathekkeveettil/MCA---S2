class Exe extends Exception
{
  public Exe(String s)
  {
   super(s);
  }
}

public class e2
{
 public static void main(String args[])
 {
   try
   {
     throw new Exe("HELLO!!");
   }
   catch(Exe ex)
   {
     System.out.println("Caught");
     System.out.println(ex.getMessage());
   }
 }
}
