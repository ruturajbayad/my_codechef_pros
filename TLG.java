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
		int r = in.nextInt();
		int sum1=0,sum2=0;
		int w=0,lead=0;
		int dif=0;
	//	int a[] = new int[r];
	//	int p[] = new int[r];
		for (int i=0 ; i<r ; i++)
		{
		    int p1 = in.nextInt();
		    int p2 = in.nextInt();
		    sum1+=p1;
		    sum2+=p2;
		    if (sum1>sum2)
		    {
		        dif = sum1 - sum2;
		        if(dif > lead)
		        {
		            lead=dif;
		            w=1;
		        }
		    }
		    else
		    {
		        dif  = sum2  - sum1;
		        if(dif>lead)
		        {
		         lead=dif;
		         w=2;
		        }
		    }
		   
		 }
	
		System.out.println(w + " " + lead);
	}
}
