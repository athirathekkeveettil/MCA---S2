import java.io.*;
import java.util.*;
 
public class t1 extends Thread {
   
    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        t1 g1 = new t1();
 
        
        g1.start();
    }
}
