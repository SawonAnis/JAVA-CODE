public class TryCatchExample7 {  
  
    public static void main(String[] args) {  
          
        try  
        {  
        int data1=50/0; 
  
        }  
   
        catch(Exception e)  
        {  
        int data2=50/0; //may throw exception   
  
        }  
    System.out.println("rest of the code");  
    }  
}  
