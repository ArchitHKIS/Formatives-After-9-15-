import java.util.*;
public class Loop {
public static void main(String[] args)
{	
	Scanner input = new Scanner(System.in);
    
    System.out.println("Printing Odd numbers between 1 and " + 1000);
    for(int i=1; i <= 1000; i++){
    	if( i % 2 != 0){
    		System.out.print(i + ", ");}
    }
    System.out.println( );
    System.out.println("Printing even numbers between 1 and " + 1000);         
    for(int i=1; i <= 1000; i++){           
    	if( i % 2 == 0){
    		System.out.print(i + ", ");
    		}
    	}
    System.out.println(" ");
    System.out.println("All prime numbers from 0-1000");
    for (int j = 3; j < 1000; j++)
    {
        if (j%2 == 1)
        {
            boolean isPrime = true;
            for (int k = j-1 ; k>= 2 ; k = k - 1)
            {
                if (j % k == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime == true)
            {
                System.out.print(j + ", ");
            }
        }
    }

}
}

		
