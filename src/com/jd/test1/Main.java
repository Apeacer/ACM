package com.jd.test1;

import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class Main 
{
	public static void main (String []args)
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			boolean flag = false;

			for(int i=m; i<=n;i++)
			{
				if(comuut(i)==i)
				{
						System.out.print(i+" "); 
						flag = true;
				}
			}
				if(!flag)
					System.out.println("no");
				else 
					System.out.println();
	
		}
		
		
	}
	public static int comuut(int i)
	{
		int temp = i;
		int result = 0;
		while(true)
		{
			result += Math.pow(temp%10,3);
			temp /= 10;
			if(temp<1)
				break;
		}
		
		return result;
			
	}
}

//public class Main 
//{
//	public static void main (String []args)
//	{
//		int [] a = {153,370,371,407};
//		Scanner scanner = new Scanner(System.in);
//		while(true)
//		{
//			ArrayList<Integer> result = new ArrayList<Integer>();
//			int m = scanner.nextInt();
//			int n = scanner.nextInt();
//			for(int a1: a)
//			{
//				if(a1<=n && a1>=m)
//					result.add(a1);
//			}
//			if(result.isEmpty())
//				System.out.println("no");
//			else 
//				for(int a2=0;a2<result.size();a2++)
//				{
//					System.out.print(result.get(a2));
//					if(a2!=result.size()-1)
//						System.out.print(" ");
//				}System.out.println();
//		}
//	}
//}