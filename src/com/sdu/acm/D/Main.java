package com.sdu.acm.D;

/*
 * 柯景腾目光呆滞，直直地盯着沈佳宜，任凭数学老师在讲台上唾沫横飞。
 今天她竟然扎了马尾，“我不知道沈佳宜为什么赢了还要绑马尾，但从此以后，努力用功读书竟然变成一件非常热血的事”，柯景腾想着，微微地笑了。
 “柯景腾，这个题目你上来做”，只见数学老师在黑板上写下了一个一元二次方程，“不行，我不能让沈佳宜瞧不起我，这么简单的题还能难倒我这个天才吗？！”。
 这个方程是这样的：ax^2+bx+c=0。

输入
第一行一个整数T<=50
以下T行，每行3个整数a,b,c , 绝对值均小于10.


输出
若方程存在无穷多解，输出Infinite；
若方程不存在解，输出No solution；
若方程有且仅有一个解，则输出这个解x；
若方程有两个不同的解，则输出x1 x2，其中x1<x2。
x,x1,x2均保留小数点后两位。


 */

import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();

		String[] r = new String[count];

		DecimalFormat num = new DecimalFormat("0.00");

		for (int z = 0; z < count; z++) {
			double a = scan.nextDouble(), b = scan.nextDouble(), c = scan
					.nextDouble();

			if (a == 0) {
				if (b == 0) {
					if (c == 0)
						r[z] = "Infinite";
					else
						r[z] = "No solution";
				} else
					{
					if(c==0)
					r[z] = "0.00";
					else
						r[z]=num.format((-c)/b);}
			} else {
				if ((b * b - 4 * a * c) > 0){
					if(a>0)
					r[z] = num.format((-b - Math.sqrt(b * b - (4 * a * c))) /( 2
							* a))
							+ " "
							+ num.format((-b + Math.sqrt(b * b - (4 * a * c)))
									/ (2 * a));
					else
						r[z] = num.format((-b + Math.sqrt(b * b - (4 * a * c))) /( 2
								* a))
								+ " "
								+ num.format((-b - Math.sqrt(b * b - (4 * a * c)))
										/( 2 * a));
						}
				if ((b * b - 4 * a * c) < 0)
					r[z] = "No solution";
				if ((b * b - 4 * a * c) == 0)
					r[z] = num.format((-b + Math.sqrt(b * b - (4 * a * c))) /( 2
							* a));
			}

			
		}
		for (String R : r)
			System.out.println(R);
	}
}
