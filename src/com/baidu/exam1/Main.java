package com.baidu.exam1;

/*
 * 计算路程
 * 有n个山头
 * 山头A与B的距离是|Sa-Sb|*2
 * 起点终点都是0
 * */



import java.util.Scanner;

public class Main 
{
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int  T=scanner.nextInt();//t组
		
		while(T-->0)
		{
			int n=scanner.nextInt();//山头数
			int list[]=new int[n+2];//山头队列
			list[0]=0;//起点
			list[n+1]=0;//终点
			
			for(int i=1;i<n+1;i++)//山头录入
			{
				list[i]=scanner.nextInt();
			}
			
			int result=0;
			
			for(int j=0;j<list.length-1;j++)//计算
			{
				result+=(Math.abs(list[j]-list[j+1]))*2;
			}
			
			System.out.println(result);
		}
	}
}
