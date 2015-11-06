package com.meituan.befortest2;

public class Solution 
{
	public int edit_distance(String src,String dst)
	{
		int distance=0;
		
		int different =src.length()-dst.length();
		distance += Math.abs(different);
		
		if(different>0)
		{
			
		}
		
		return distance;
	}
}
