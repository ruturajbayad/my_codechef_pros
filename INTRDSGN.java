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
		for (int i = 0 ; i<t ; i++)
		{
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    int d = in.nextInt();
		    int sum1 = a+b;
		    int sum2 = c+d;
		    if(sum1<sum2)
		    {
		        System.out.println(sum1);
		  }
		  else
		  {
		       System.out.println(sum2);
		  }
		}
	}
}
