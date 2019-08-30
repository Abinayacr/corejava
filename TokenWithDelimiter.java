package corejava;

import java.util.StringTokenizer;

public class TokenWithDelimiter 
{
	public static void main(String args[]) 
	{
		String msg="http://10.123.43.67:80/";
		StringTokenizer st=new StringTokenizer(msg,"://.",true);
		while(st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());
		}
		String[] tokens="http://10.123//43.67:80/".split("//");
		for(String token:tokens)
		{
			System.out.println(token);
		}
	}
}
