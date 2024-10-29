public class StringInJava {
    public static void main(String[] args) {



        String str = "Java is Awesome";
        String str3 = "Java is Awesome";

        String str2 = new String("java is awesome");
        String str4 = new String("Java is Awesome");

        System.out.println(str2.equalsIgnoreCase(str));
    }
}
