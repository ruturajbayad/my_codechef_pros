// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            
            for (int i=0 ; i<t ; i++)
            {
                int n = in.nextInt();
                 BigInteger fact = new BigInteger("1");
                for (int j=2;j<=n;j++)
                {
                    fact=fact.multiply(BigInteger.valueOf(j));
                    
                }
                System.out.println(fact);
                
            }
            
	    
	}
}




