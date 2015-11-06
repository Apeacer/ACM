package com.baidu.exam2016;

import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		Scanner scanner =new Scanner(System.in);
		int T =scanner.nextInt();
		
		while(T-->=0)
		{
			String str = scanner.next();
			char []strArrary = str.toCharArray();
			boolean[] ifuse = new boolean[12];
			
			int a = 0;
			int n = 0;
			int result = 0;
			for(int i=0; i<strArrary.length; i++)
			{
				int position = strArrary[i]-97;
				for(int j=0; j<position; j++)
				{	
					if(ifuse[j])
						a++;
				}
				ifuse[position] = true;
				n = 12-position-1;
					
				result += a*getresult(12-i-1);
			}
			System.out.println(result);
			

			
			
		}
		
	}
	static int getresult( int n)
	{
		if(n==1)
			return n;
		else 
			return n*getresult(n-1);
	}
	
}
