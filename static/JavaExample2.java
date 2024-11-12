class JavaExample2{
  static int i = 100;
  static String s = "Beginnersbook";

  static void display()
  {
     System.out.println("i:"+i);
     System.out.println("i:"+s);
  }


  void funcn()
  {

      display();
  }

  public static void main(String args[])
  {
	  JavaExample2 obj = new JavaExample2();

	  obj.funcn();
	  

      display();
   }
}
