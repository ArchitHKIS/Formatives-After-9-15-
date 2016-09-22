import java.util.*;
public class Loop {
public static void main(String[] args)
{	
	Scanner input = new Scanner(System.in);
    
    System.out.println("Printing Odd numbers between 1 and " + 1000);
   int limit = 1000;
  
    for(int i=1; i <= 1000; i++){
           
          
            if( i % 2 != 0){
                    System.out.print(i + ", ");}
    }
    System.out.println( );
    System.out.println("Printing even numbers between 1 and " + 1000);         
    for(int i=1; i <= 1000; i++){           
    	if( i % 2 == 0){
    		System.out.print(i + ", ");}
    	}
    	// loop going forever
    int i = 0;
    	 for (int j = 1; j <= 1000; i++) {
	            //if (i%2 != 0)
	            if (j%2 == 1) //odd number
	            {
	            	boolean isPrime = true;
	                for (int k = j-1 ; k>= 2 ; k = k - 1)
	                {
	                    if (i % k == 0)
	                    {
	                        isPrime = false;
	                        //i is NOT a prime number
	                    }
	                }
	                if (isPrime == true)
	                {
	                    //is a prime number!
	                    System.out.println(i +", ");
	                }
	            }
	        }

    	


}
}