package com.jd.quit1;






import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int lastcount =0;
		boolean unfinish =true;
		
		while(unfinish)
		{
			lastcount++;
			
			int temp = n*lastcount;
			for(int i=0;i<n-1;i++)
			{
				temp = (temp+1)*n/(n-1);
				if(temp%n!=0)
					break;
			}
			if(temp%n==0)
			{
				unfinish =false;
				System.out.println(temp+1);
				
			}
		}
		
		
	}

}
