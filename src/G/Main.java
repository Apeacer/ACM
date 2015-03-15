package G;

/*
 * 提问：求x^y的各位数字和的各位数字和的各位数字和的各位数字和。


输入
第一行一个整数T<=100
以下T行，每行两个整数x,y，其中0<=x,y<=100000。
输入保证没有0^0的情况。

输出
对于每组测试数据，按照题目要求输出一行表示结果。

 */

import java.util.*;

public class Main {
	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		int count=scan.nextInt();
		int r[]=new int[count];
		
		for(int z=0; z<count; z++)
		{
			int x=scan.nextInt(),y=scan.nextInt();
			long t=(long) Math.pow(x, y);
			
			
//			long p=t,o=1;
//			for(int u=0;t>=10;u++){
//				t-=p*o;
//				
//			for(int v=0; t>=10; v++)
//			{
//				p/=10;
//				o*=10;
//			}
//			
//			}
			
			
//			String t1=t+"";
//			
//			for(int v=0; v<t1.length(); v++)
//			{
//				t2[v]=Integer.parseInt(t1.substring(v,v+1));
//			}
//			r[z]=t1;
			
			for(int R : r)
			{System.out.println(R);
			System.out.println(t);}
		}
	}

}
