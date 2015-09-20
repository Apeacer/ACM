package com.jd.quit2;






import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public void name() 
	{
		int a1=1,a2=2,a3,a4;
		final int a5=5,a6=6,a7,a8;
		
		a7=a1+a2;
		a3=a2+a6;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int gifts[][] = new int[6][6];
			
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<6;j++)
					gifts[i][j]=scanner.nextInt();
			}
			
			List<Integer> results = new ArrayList<Integer>();
			
			countr(results, gifts, 0, 0, 0);
			
			int result = 0;
			for(int  a:results)
				if(a>result)
					result=a;

			System.out.println(result);
	
		}
	}
	
	static void countr(List<Integer> results,int [][]g,int i,int j ,int perresult)
	{
		if(i==5&&j==5)
		{
			results.add(g[5][5]+perresult);
			System.out.println(g[5][5]+perresult);
		}
		if(i==5 && j<5)
		{
			countr(results, g, i, j+1,g[i][j]+perresult);
		}
		if(j == 5 && i<5)
		{
			countr(results, g, i+1, j,g[i][j]+perresult);
		}
		else 
		{
			countr(results, g, i+1, j,g[i][j]+perresult);
			countr(results, g, i, j+1,g[i][j]+perresult);
		}
		
	}

}
