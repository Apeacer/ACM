package com.poj.id1000;

//Description
//
//计算a加b。
//Input
//
//两个整数a和b，其中0≤a, b≤10。
//Output
//
//输出a与b的和。
//Sample Input
//
//1 2
//Sample Output
//
//3

import java.util.Scanner;

public class Main 
{
	public static void main(String []arg)
	{
		Scanner scanner=new Scanner(System.in);
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		System.out.println(a+b);
	}
}
