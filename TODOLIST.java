/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner in = new Scanner(System.in);
	   
	    //value of T
	    int t=in.nextInt();
	    int i=0;
	  while(i<t)
	    {   
	        //value of A that indicate size of array
	         int n = in.nextInt();
	          int count=0;
	            
	            
	        for (int k=0; k<n ; k++)
	        {
	            
	            int a=in.nextInt();
	                   if(a>=1000)
	                    {
	                        count++;
	                    }
	       
	        }
	        System.out.println(count);
	        i++;
	    }
    }
}
