package com.baidu.exam2;

/*
 * 给密语算权值
 * a为1，b为2......
 * A为两个a......
 * 连续n个a，则权值为n*n*1.........
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
			String passward=scanner.next();//密语
			
			int start=0;//开始
			int end=1;//结束
			int result=0;
			
			for(int i=0; i<passward.length();i++)
			{
				if(passward.charAt(i)!=passward.charAt(i+1))
				{
					result+=compute(passward.substring(0,i+1));//把每列权值合起来
					passward=passward.substring(i+1,passward.length());
				}
			}
			
//			for(int i=1;i<passward.length();i++)//分割
//			{
//				String str_i=String.valueOf(passward.charAt(i));
//				String str_i2=String.valueOf(passward.charAt(i-1));
//				
//				if(str_i.equalsIgnoreCase(str_i2))
//				{
//					end=i+1;
//				}
//				else 
//				{
//					result+=compute(passward.substring(start,end));//把每列权值合起来
//					start=i;
//					end=i+1;
//				}
//			}
			result+=compute(passward.substring(start,passward.length()));
			
			System.out.println(result);
			
		}
	}
	
	static int compute(String pice)
	{
		char computList[]=pice.toCharArray();
		
		int count=0;
		int result=0;

		for(int now:computList)
		{
			if(now<97)//大写
			{
				result=(now+32-96);
				count+=2;
			}
			else
			{
				result=now-96;
				count++;
			}
		}
		System.out.println(pice+" "+result*count*count);
		return result*count*count;
	}
	
	
}
