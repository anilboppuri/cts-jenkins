package cts.jenkins.automation;

/**
 * Hello world!
 *
 */
public class App 
{
	  int x ;
    public static void main( String[] args )
    {
    	int a = 10;
    	int b = 0;
    	
    	
    	try{
    	         int c = a/b;	
    	         System.out.println(c);
    	         while(true){
    	        	 
    	        	 System.out.println("never ends");
    	         }
    		
    	}catch(Exception e){
    		
    		throw new ArithmeticException(e.getMessage());
    	}
    	
        //System.out.println( "Hello World!" );
    }
}
