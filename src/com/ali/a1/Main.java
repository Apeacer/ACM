package com.ali.a1;

import java.util.Random;

public class Main 
{
	
	public static void main(String []args)
	{
		Random random=new Random();
		int a[]=new int[1001];
		
		for(int i=0;i<900;i++)//900个数
		{
			boolean is_equal=true;
			
			while (is_equal) 
			{
				int now=random.nextInt(1000)+1;//生成1-1000
				if(a[now]==1)//重复
				{
					is_equal=true;
				}
				else 
				{
					a[now]=1;//标记
					System.out.println(now+" "+i);//打印
					is_equal=false;
				}

			}
				
		}
		
		
	}

}
