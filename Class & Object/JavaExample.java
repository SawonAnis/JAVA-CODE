class JavaExample{
   private static String str = "BeginnersBook";


   static class MyNestedClass{

	public void disp() {

	   System.out.println(str); 
	}

   }
   public static void main(String args[])
   {

	JavaExample.MyNestedClass obj = new JavaExample.MyNestedClass();
	obj.disp();
   }
}
