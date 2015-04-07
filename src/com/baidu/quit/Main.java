package com.baidu.quit;

public class Main 
{
	public static void main (String []args)
	{
		final int test[]=new int[1000];
		for (int i = 0; i < test.length; i++) 
		{
			test[i]=i;
		}
		
		Quit quit=new Quit();
		
		System.out.println(quit.quit1(test[17])+"");
		for (int i = 0; i < 1000; i++) {
			quit.quit2(i);
		}
//		quit.quit2(test[128]);
	}
	
}



class Quit
{
	/* 11111111111111111111111111111111111111111111111111111111111111111111111111111111111
     * 实现一个函数，对一个正整数n，算得到1需要的最少操作次数。操作规则为：如果n为偶数，将其除以2；如果n为奇数，可以加1或减1；一直处理下去。
		例子：
			func(7) = 4，可以证明最少需要4次运算
			n = 7
			n-1 6
			n/2 3
			n-1 2
			n/2 1
		要求：实现函数(实现尽可能高效) int func(unsign int n)；n为输入，返回最小的运算次数。给出思路(文字描述)，完成代码，并分析你算法的时间复杂度。
	 */
	
	public int quit1(int input) 
	{
		if(input==1)
			return 0;
		if (input%2==0) 
		{
			return 1+quit1(input/2);
		}
		else
		{
			return 1+quit1(input-1);
		}
	}
	
	
	/*
	 * 22222222222222222222222222222222222222222222222222222222222222222222222222222222222
	 * 给定函数d(n)=n+n的各位之和，n为正整数，如d(78)=78+7+8=93。这样这个函数可以看成一个生成器，如93可以看成由78生成。
     * 定义数A：数A找不到一个数B可以由d(B)=A，即A不能由其他数生成。现在要写程序，找出1至10000里的所有符合数A定义的数。
	 */
	public void quit2(int input) 
	{
System.out.print(" input:"+input+" result:");		
		boolean counts[]=new boolean[10000];
		for(int i=0;i<10000;i++)
		{
			if(quit2_out(i)==input )
			{
				counts[i]=true;
				System.out.print(i+" ");
			}
			if(i==9999)
				System.out.println(" ");
		}

	}
	private int quit2_out(int num) 
	{
		int length=(num+"").length();
		int result=0;
		int num_now=num;
		
		for(int i=length;i>0;i--)
		{
			int bit=(int)Math.pow(10,(i-1));
			result+=num_now/bit;
			num_now=num_now%bit;
		}
		return (result+num);//+=num;
	}
	
}
