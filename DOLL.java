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
		for (int i =0 ; i<t ; i++)
		{
		    int p = in.nextInt();
		    int h = in.nextInt();
		    int count=0;
		    for(int j = 0 ; j<p ; j++)
		    {
		        int ha = in.nextInt();
		        if(h<ha)
		        {
		            count++;
		        }
		        
		    }
		 System.out.println(count);
		}
	}
}
