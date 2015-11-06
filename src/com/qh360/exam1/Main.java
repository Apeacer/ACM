package com.qh360.exam1;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T-->0)
		{
			String string= input.next();
			int length = string.length();
			for(int i = 0; i<length;i++)
			{
				char p = string.charAt(i);

				if (p=='#')
				{
					if(i==0)
					{
						string =string.substring(1,length);
						length-=1;
						i=-1;
					}
					else 
					{
						string = string.substring(0,i-1)+string.substring(i+1,length);
						length-=2;
						i-=2;	
					}
				}
				if (p=='@')
				{
					string = string.substring(i+1,length);
					length-=(i+1);

					i=-1;	
				}		
			}
			System.out.println(string);
		}
	}
}
