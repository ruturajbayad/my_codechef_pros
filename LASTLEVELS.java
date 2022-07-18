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
		int t = in.nextInt();
		 
		for (int i = 0 ; i < t ; i++)
		{
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    if(x>3)
		    {
		       int b = 0;
		       while(x>=1)
		       {
		           if(x<=3)
		           {
		               b = b + x * y;
		           }
		           else
		           {
		               b = b + 3*y+z;
		           }
		           x=x-3;
		       }
		        System.out.println(b);
		    }
		    else 
		    {
		        System.out.println(x*y);
		        
		    }
		}
	}
}
