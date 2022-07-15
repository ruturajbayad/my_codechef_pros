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
		HashMap<Integer, Integer> m = new HashMap<Integer , Integer>();
		m.put(0,6);
	    m.put(1,2);
		m.put(2,5);
		m.put(3,5);
		m.put(4,4);
		m.put(5,5);
		m.put(6,6);
		m.put(7,3);
		m.put(8,7);
		m.put(9,6);
		for (int i = 0 ; i<t ; i++)
	    {
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int sum = a + b;
	        int ans = 0;
	        while(sum>0)
	        {
	            int r = sum % 10;
	            ans = ans + m.get(r);
	            sum = sum / 10;
	        }
	        System.out.println(ans);
	    }
	}
}
