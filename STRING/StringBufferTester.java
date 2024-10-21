import java.util.Arrays;

public class StringBufferTester {

    public static void main(String[] args) {

       StringBuffer sb = new StringBuffer("Java is Awesome!");
       System.out.println(sb.capacity());
      System.out.println(sb.length());

     StringBuffer stringBuffer = new StringBuffer();
       stringBuffer.append("Happy ");
  
        char [] chars = new char[3];
       stringBuffer.getChars(6, 9, chars, 0);

       System.out.println(new String(chars));

        StringBuffer sb2 = new StringBuffer("Nayem ");

       System.out.println(sb2);

        System.out.println(sb2.reverse());
    }
}
