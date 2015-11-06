package com.enet.test2;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			int length = scanner.nextInt();
			int c = scanner.nextInt();// ablity
			int b[]=new int[length];
			
			for(int i=0;i<length;i++)
			{
				b[i]=scanner.nextInt();
			}
			
			
			for(int bi:b)
			{
				if(bi<=c)
					c+=bi;
				else 
				{
					c+= commy(c, bi);
				}
				
			}
			
			System.out.println(c);
			
		}
		
		

	}
	public static int commy(int a, int b) 
	{   
		int i = 1;    
		int commyue = 0;   
		int c = a;   
		if (c < b)    
			c = b;    
		while (i <= c) 
		{     
			if (a % i == 0 && b % i == 0)     
				commyue = i;    
			i++;   
		}    
		return commyue;  }

}
