public class StaticClassExample{
private static String str= "Edureka";

static class MyNestedClass{

  public void disp(){
System.out.println(str);
}
}
public static void main(String args[]){
StaticClassExample.MyNestedClass obj = new StaticClassExample.MyNestedClass();
obj.disp();
}
}
