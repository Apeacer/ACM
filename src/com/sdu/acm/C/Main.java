package com.sdu.acm.C;

/*
 * 一般地，在ACM比赛中，题目的难度和题目的文字量是成反比的。
不过这次，我要说的，是一道简单而且题目很短的题目。
给定一个正整数n (1<=n<=10^9)，判断是否存在x >= 1，满足 1 + 2 + .. + x = n。 

输入
第一行一个整数T，表示有T组测试。(T<=1000)
之后T行，每行一个整数n。 

输出
对于每组测试数据：
如果存在满足要求的x，输出一行x。
否则输出"No Sotution"（引号仅作装饰，不输出）。


 */

import java.util.*;

public class Main {

	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		String[] r = new String[a];

		for (int z = 0; z < a; z++) {
			long b = input.nextLong(), c = 1;

			while (b > 0) {
				b -= c;
				c++;
			}
			if (b == 0)
				r[z] = c - 1 + "";
			if (b < 0)
				r[z] = "No Solution";
		}
		for (String R : r)
			System.out.println(R);
	}

}
