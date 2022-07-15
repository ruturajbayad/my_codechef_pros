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
		    int n = in.nextInt();
		    int a[] = new int[n];
		    
		    for (int j=0 ; j<n ; j++)
		    {   
		       a[j] = in.nextInt();
		    }
		    Arrays.sort(a);
		   
		    int freq = 0 ;
		    int cfreq = 1;
		    for(int x=0 ; x<n-1 ; x++)
		    {
		        if(a[x]==a[x+1])
		        {
		            cfreq++;
		        }
		        else 
		        {
		            cfreq = 1; 
		            
		        }
		        if (cfreq > freq)
		        {
		            freq  = cfreq;
		        }
		    }
		    
		    System.out.println(n - freq);
		 }
	     
	}
}