package JavaBasics;

import java.util.Arrays;
class CoinCount 
{
	public static void main(String[] args) 
	{
		boolean ar[] = new boolean[10];
		Arrays.fill(ar,true);
		for (int i=2; i<=ar.length ; i++)
		{
			for (int j=i-1; j<ar.length; j=j+1)
			{
				ar[j]=!ar[j];
			}
		}
		int c=0;
		for (boolean data :ar)
		{
			if(data)
				c++;
		}
		System.out.println(c);
	}
}
