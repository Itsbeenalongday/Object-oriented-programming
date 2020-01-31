package problem1;

import java.lang.reflect.Method;

public class ObjectTest {
	public static void main (String []args ) throws Exception
     {
        int counter=0; 
        Class c = Class.forName("java.lang.Object");
        
        Method[]m = c.getDeclaredMethods();

       for( Method mi: m )         
       {
           System.out.println (mi.getName());
           counter++;          
       }  
         System.out.println ("the number of methods:" + counter); 
     }
}