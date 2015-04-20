package com.zetsoft.test1;

import javax.crypto.spec.IvParameterSpec;

public class doPrint 
{
	
	public static void main (String [] args)
	{
		int m=6;
		int n=6;
		
		int data[][]=new int [m][n];
		
		System.out.println("原矩阵：");
		for (int i=0; i<m; i++)
		{
			for (int j=0; j<n; j++)
			{
				data[i][j]=n*i+j;
				
				System.out.print(data[i][j]+"\t");
			}System.out.println();
		}System.out.println();
		
		
		ArrayPrint arrayPrint=new ArrayPrint();
		System.out.println("打印");
		arrayPrint.ClockwisePrint(data);
		
		
		
	}
	
}


class ArrayPrint
{
	private final int NOT_MARK=0;
	private final int IS_MARK=1;
	private final int START_I=0;
	private final int START_J=0;
	
	public ArrayPrint()
	{}
	
	public void ClockwisePrint(int data[][])
	{
//		int mark[][]=new int[data.length][data[0].length];//声明标记
//		
//		for(int i=0; i<mark.length; i++)//初始化全为0
//		{
//			for(int j=0; j<mark[0].length; j++)
//			{
//				mark[i][j]=NOT_MARK;
//			}
//		}
		int startX = 0;  
	    int startY = 0;  
	    int endY = data[0].length - 1;  
	    int endX = data.length - 1; 
	    
		while ((startX <= endX) && (startY <= endY)) {  
  
	        ClockwisePrint_do( startX, startY, endX, endY, data);//调用递归打印
	        startX++;  
	        startY++;  
	        endX--;  
	        endY--;  
	    }
		
		
	}
	
	private void ClockwisePrint_do(int startX, int startY, int endX ,int endY, int[][] data)
	{
		if(startY==endY)
		{
			for(int i=startX; i<endX; i++)
			{
				System.out.print(data[startY][i]+" ");
			}
			return;
		}
		if(startX==endX)
		{
			for(int i=startY; i<endY; i++)
			{
				System.out.print(data[i][startX]+" ");
			}
			return;
		}
		
	    for (int i = startY; i < endY; i++ ) {  
	        System.out.println(data[startX][i]);  
	    }  
	    for (int i = startX; i < endX; i++ ) {  
	        System.out.println(data[i][endY]);  
	    }  
	    for (int i = endY; i > startY; i-- ) {  
	        System.out.println(data[endX][i]);  
	    }  
	    for (int i = endX; i > startX; i-- ) {  
	        System.out.println(data[i][startY]);  
	    } 
		
	}
//	private void ClockwisePrint_do(int i, int j, int mark[][] ,int [][]data)
//	{
//		System.out.print(data[i][j] + " ");//打印
//		mark[i][j]=IS_MARK;//标记
//		
//		if(j+1<data.length && mark[i][j+1]==NOT_MARK && mark[i+1][j]==NOT_MARK)//向右
//		{
//			ClockwisePrint_do(i, j+1, mark, data);
//		}
//		
//		if(i+1<data[j].length && mark[i+1][j]==NOT_MARK)//向下
//		{
//			ClockwisePrint_do(i+1, j, mark, data);
//		}
//		
//		if(j-1>=0 && mark[i][j-1]==NOT_MARK)//向左
//		{
//			ClockwisePrint_do(i, j-1, mark, data);
//		}
//		
//		if(i-1>=0 && mark[i-1][j]==NOT_MARK)//向上
//		{
//			ClockwisePrint_do(i-1, j, mark, data);
//		}
//		
//	}
}