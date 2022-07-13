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
		
		for (int i=0 ; i<t ; i++)
		{
		    int n = in.nextInt();
		    int s=0,l=0;
		    for(int j=0 ; j<n ; j++)
		    {
		        String str = in.next();
		        if(str.equals("START38"))
		        {
		            s+=1;
		        }
		        else
		        {
		            l+=1;
		        }
		    }
		    System.out.println(s + " " + l);
		}
	}
}
