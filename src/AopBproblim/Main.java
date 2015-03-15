package AopBproblim;

/*
 相信大家早已不屑于做A + B Problem这样的简单题了，那么现在让大家算A op B，其中op可能是加法，减法或者乘法。



输入
第一行一个数字T表示有T组测试数据。
接下来T行，每行以a 符号 b的形式给出，三部分别用一个空格隔开。
其中-10^9 <= a, b = 10^9，op是'+', '-', 或者‘*’ 三者之一。
输出
对于每组测试数据输出计算结果。 


 */

import java.util.*;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int count=scan.nextInt();
		
		long r[]= new long[count];
		
		for(int z= 0; z<count; z++)
		{
			long a=scan.nextLong();
			String b=scan.next();
			long c=scan.nextLong();
			
			if(b.equals("+"))
				r[z]=a+c;
			if(b.equals("-"))
				r[z]=a-c;
			if(b.equals("*"))
				r[z]=a*c;
			
		}
		for (long R:r)
			System.out.println(R);
			
	}
	

}
