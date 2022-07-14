/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int a[] = new int[1000000];
	    int p[] = new int[1000000];
	    for(int i=1 ; i<1000000 ; i++)
	    {
	         if(i%10==2 || i%10==3 || i%10==9)
	        {
	            a[i]=1;
	        }    
	        else
	        {
	            a[i]=0;
	        }
	         p[i] = p[i-1] + a[i];
	    }
	    int t = in.nextInt();
	    for (int j=0 ; j<t ; j++)
	    {
	        int l = in.nextInt();
	        int r = in.nextInt();
	        int ans = p[r]-p[l-1];
	        System.out.println(ans);
	    }
	}
		// your code goes here
}

