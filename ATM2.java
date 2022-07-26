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
		while(t!=0)
		{
		    int p = in.nextInt();
		    int a = in.nextInt();
		    while(p!=0)
		    {
		        int w = in.nextInt();
		        if(a>=w)
		        {
		        a = a-w;
		        System.out.print("1");
		        }
		        else
		        {
		        System.out.print("0");
		        }
		       p--;
		    }
		    System.out.println("");
		    
		    t--;
		}
	}
}
