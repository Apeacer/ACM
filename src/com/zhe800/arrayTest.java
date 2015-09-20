package com.zhe800;

//已知两个整数数组A和B。比如: A = [2, 2, 2, 3, 3, 1, 5, 0]  B=[2, 3, 6, 5, 2, 3, 9]
//我们定义子数组为某一个数组里面的连续的一个或多个数组成的数组. 
//比如 [2, 3] 既是A又是B的子数组. 但[6, 5]只是B的子数组,不是A的。另外[3，2]不是A的子数组。[2, 3]也是A, B的公共子数组.
//要求: 写一个函数 int f(A, B), 返回任意两个数组的最长公共子数组的长度(元素个数). 在上面例子中,需要返回2. 
//注意：1）不能增加用额外的数组或其他存储；只能使用若干个变量；
//      2）请以保证正确为优先考虑；可以不用考虑是否是最优的算法。


public class arrayTest 
{
	public static void main(String []args)// 程序入口
	{
		int [] A={2, 2, 2, 3, 3, 1, 5, 0};
		int [] B={2, 3, 6, 5, 2, 3, 9};
		
		System.out.println(f(A,B));
		
	}
	
	public static int f(int []A,int []B)
	{
		int result = 1; // 储存结果

		int length = A.length;
		if(B.length < A.length)
			length = B.length;// 找到短数组的长度，为公共子数组的可能的最大长度
		
		for(int i = 2; i <= length; i++)// i为需要比较的两个数组的子数组的长度
		{
			if(compare(i, A, B) && i > result)
				result = i;
		}
		
		return result;
		
		
	}
	
	/**
	 * 比较两个数组中的子数组，若A、B中有相同的长度为i的子数组，则返回true，否则返回false
	 * @param i 比较的长度
	 * @param A 比较的数组A
	 * @param B 比较的数组B
	 * @return
	 */
	public static boolean compare(int i,int []A,int []B)
	{
		for(int p = 0; p <= A.length-i ; p++)// 扫描A数组
		{
			for(int q = 0; q <= B.length-i; q++)//　扫描B数组
			{
				for(int m = 0 ; m < i; m++) // 比较两数组的子数组
				{
					if(A[p+m] != B[q+m]) // 数组中有不同的位
						break;
					else 
					{
						if(m == i-1) // 子数组相同
							return true;
					}
				}
			}
		}
		return false;
	}
}
