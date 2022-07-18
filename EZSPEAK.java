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
		for(int i=0 ; i<t ; i++)
		{
		    int count=0;
		    int n = in.nextInt();
		    String s = in.next();
		    for(int j=0 ; j<n ; j++)
		    {
		        if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='u' || s.charAt(j)=='i' || s.charAt(j)=='o')
		        {
		            count=0;
		        }
		        else
		        {
		           count++;
		           if(count==4)
		           break;
		           
		        }
		      }
		      if(count==4)
		        {
		            System.out.println("NO");
		        }
		        else
		        {
		            System.out.println("YES");
		        }
		    
		}
		
	}
}
