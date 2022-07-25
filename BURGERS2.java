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
		    int b1 = in.nextInt();
		    int b2 = in.nextInt();
		    int buy = in.nextInt();
		    int amount = in.nextInt();
		    int mn = buy*b1;
		    int mx = buy*b2;
		    if(amount<mn)
		    {
		        System.out.println(-1);
		    }
		    else if (amount>=mx)
		    {
		        System.out.println("0 " + buy);
		    }
		    else
		    {
		        int ans = (amount - mn)/(b2 - b1);
		        System.out.println(buy-ans + " " + ans);
		    }
		    t--;
		}
	}
}
