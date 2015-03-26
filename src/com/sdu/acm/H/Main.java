package com.sdu.acm.H;

/*
由于乳制品产业利润很低，所以降低原材料（牛奶）价格就变得十分重要。帮助ZYC乳业找到最优的牛奶采购方案。
ZYC乳业从一些奶农手中采购牛奶，并且每一位奶农为乳制品加工企业提供的价格是不同的。此外，每位奶农每天能提供的牛奶数量是一定的。每天ZYC乳业可以从奶农手中采购到小于或者等于奶农最大产量的整数数量的牛奶。
给出ZYC乳业每天对牛奶的需求量，还有每位奶农提供的牛奶单价和产量。计算采购足够数量的牛奶所需的最小花费。
        注：每天所有奶农的总产量大于ZYC乳业的需求量。


输入
第一行，一个整数T，表示有T组测试数据。(T<=10)
对于每组测试数据：
第 1 行共二个数值:N,(0<=N<=2,000,000)是需要牛奶的总数；M,(0<= M<=5,000)是提供牛奶的农民个数。
第 2 到 M+1 行:每行二个整数:Pi 和 Ai。
Pi(0<= Pi<=1,000) 是农民 i 的牛奶的价格。
Ai(0 <= Ai <= 2,000,000)是农民 i 一天能卖给Marry的牛奶制造公司的牛奶数量。


输出
对于每组测试数据输出单独的一行包含一个整数，表示Marry的牛奶制造公司拿到所需的牛奶所要的最小费用



*/

import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int count=scan.nextInt();
		
		int[]r=new int [count];
		
		
		for(int z=0; z<count; z++)
		{
			int a=scan.nextInt(),b=scan.nextInt();
			int[][]g=new int [b][2];
			
			for(int y=0; y<b; y++)
			{
				int c=scan.nextInt();
				int d=scan.nextInt();
				g[y][0]=c;
				g[y][1]=d;
			}
			
			int e,temp,temp2;
			
			for(int v=0; v<b-1; v++)
			{
				e=v;
				
				for(int x=v+1; x<b; x++)
				
					if(g[x][0]<=g[e][0])
						e=x;
					temp=g[e][0];
					g[e][0]=g[v][0];
					g[v][0]=temp;
					
					temp2=g[e][1];
					g[e][1]=g[v][1];
					g[v][1]=temp2;
				
			}
			int u=0,t=0,p=0,more=0;
			while(t<a)
			{
				t+=g[u][1];
				p+=g[u][1]*g[u][0];
				u++;
				
			}
			if(t>a)
			{
				more=g[u-1][0]*(t-a);
			}
			r[z]=p-more;
			
		}
		for(int R :r)
			System.out.println(R);
		
	}

}
