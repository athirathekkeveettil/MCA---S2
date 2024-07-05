interface A 
{
    public void data();
   
}
class B implements A
{
    public void data ()
    {
        String name="Delwin";
        int rollno=23;
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class inter_face 
{
    public static void main (String args [])
    {
        B h= new B();
        h.data();
    }
}
