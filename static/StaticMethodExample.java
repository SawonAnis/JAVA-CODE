
public class StaticMethodExample
{

   static int j = 100;

   int n = 200;
 

   static void a()
   {
   int a = 200;
   System.out.println("Print from a");

   n = 100; 
 


   a2(); 
 

   }
 

   void a2()
   {
   System.out.println("Inside a2");
   }
 
