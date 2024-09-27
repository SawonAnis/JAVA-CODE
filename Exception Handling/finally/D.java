class D { 
    public static void main(String[] args) 
    { 
        int k = 15; 
        try { 
            System.out.println("In try block"); 
            int z = k / 0; 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("In catch block"); 
            System.out.println("Dividing by zero but caught"); 
        } 
  
        finally
        { 
            System.out.println("Executes whether an exception occurs or not"); 
        } 
    } 
} 