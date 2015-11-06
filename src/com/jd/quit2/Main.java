package com.jd.quit2;






import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

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
//			test
//			int gifts1[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
			
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
		if( i == 5 && j == 5 )
		{
			results.add(g[5][5]+perresult);
		}
		if( i == 5 && j < 5 )
		{
			countr(results, g, i, j+1,g[i][j]+perresult);
		}
		if( j == 5 && i < 5 )
		{
			countr(results, g, i+1, j,g[i][j]+perresult);
		}
		if( i < 5 && j < 5 ) 
		{
			countr(results, g, i+1, j,g[i][j]+perresult);
			countr(results, g, i, j+1,g[i][j]+perresult);
		}
	}

}
