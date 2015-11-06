package com.meituan.befortest1;

import java.util.ArrayList;
import java.util.List;

public class Solution 
{
	public int sum(int [][]arr,int row, int column)
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<row-2; i++)
		{
			for(int j=0; j<column; j++)
			{
				list.add((arr[i+1][j]+arr[i+2][j]+arr[i][j]));
			}
		}
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column-2; j++)
			{
				list.add((arr[i][j]+arr[i][j+1]+arr[i][j+2]));
			}
		}
		for(int i=0; i<row-2; i++)
		{
			for(int j=0; j<column-2; j++)
			{
				list.add((arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]));
			}
		}
		
		int result=list.get(0);
		for(int a: list)
		{
			if( a>result)
				result=a;	
		}
		
		return result;
	}
	
}
//	public static void main (String [] args)
//	{
//		int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(sum(arr,3,3));
//	}
