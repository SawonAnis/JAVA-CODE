class A 
{ 
 void msg() 
 { 
    System.out.println("Hello Java"); 
  } 
} 
class B 
{ 
  void msg() 
  { 
     System.out.println("Welcome you"); 
  } 
 } 
public class C extends A, B 
{ 

 public static void main(String args[]) 
 { 
   C obj = new C(); 
   obj.msg();
  } 
 }
