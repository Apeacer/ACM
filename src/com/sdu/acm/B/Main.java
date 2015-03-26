package com.sdu.acm.B;

/*
 * 
zxg是一个爱吃蜂蜜的贪吃鬼，一天他发现了一个马蜂窝，但他不确定他的切面面积有多大，因为他虽然很嘴馋，但他还是很怕马蜂的，所以他迫切的想要知道这个马蜂窝的切面面积有多大，所以请你帮帮忙。

    现在已知这些马蜂窝的切面都是平行六边形，并且知道其中三条边的长度，如下图所示即为a = 2, b = 3, c = 4时马蜂窝的切面。




    已知一个六边形的小格子的面积为1，则18即为马蜂窝的切面。

    现在给定一组a,b,c，请你求出马蜂窝的切面面积。




输入
第一行，一个整数T，表示有T组测试数据（T<=50）

接下来T行，每行3个整数表示三条边的长度a，b，c（2<=a,b,c<=10^6）

输出
 对于每组测试数据，输出切面面积。


 */

import java.util.*;

public class Main {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		long []r=new long[count];
		
		for (int z=0; z<count; z++)
		{
			long a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
			
			r[z]=a*c+b*c+a*b-a-b-c+1;
			
		}
		for(long R:r)
			System.out.println(R);
	}

}
