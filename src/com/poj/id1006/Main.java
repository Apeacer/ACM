package com.poj.id1006;

//人生来就有三个生理周期，分别为体力、感情和智力周期，它们的周期长度为23天、28天和33天。每一个周期中有一天是高峰。
//在高峰这天，人会在相应的方面表现出色。例如，智力周期的高峰，人会思维敏捷，精力容易高度集中。因为三个周期的周长不同，
//所以通常三个周期的高峰不会落在同一天。对于每个人，我们想知道何时三个高峰落在同一天。对于每个周期，我们会给出从当前
//年份的第一天开始，到出现高峰的天数（不一定是第一次高峰出现的时间）。你的任务是给定一个从当年第一天开始数的天数，输
//出从给定时间开始（不包括给定时间）下一次三个高峰落在同一天的时间（距给定时间的天数）。例如：给定时间为10，下次出现
//三个高峰同天的时间是12，则输出2（注意这里不是3）。
import java.util.Scanner;

public class Main 
{

	static Scanner inputScanner=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		final int cycle_p=23;
		final int cycle_f=28;
		final int cycle_i=33;
		
		int T=0;
		
		while(inputScanner.hasNext())
		{
			T++;//当前组数
			int physical=inputScanner.nextInt();
			int fellings=inputScanner.nextInt();
			int iq=inputScanner.nextInt();
			int start=inputScanner.nextInt();
			
			if(physical==-1 && fellings==-1 && iq==-1 && start==-1)
			{
				break;
			}
			
			physical%=cycle_p;
			fellings%=cycle_f;
			iq%=cycle_i;
			int day=1;

			while(true)
			{
				if(day%cycle_p==physical && day%cycle_f==fellings && day%cycle_i==iq && day>=start)
				{
					System.out.println("Case "+ T +": the next triple peak occurs in "+(day-start)+" days.");
					break;
				}
				day++;
			} 
		}
	}
	
/*
sample input

0 0 0 0
0 0 0 100
5 20 34 325
4 5 6 7
283 102 23 320
203 301 203 40
-1 -1 -1 -1

sample output

Case 1: the next triple peak occurs in 21252 days.
Case 2: the next triple peak occurs in 21152 days.
Case 3: the next triple peak occurs in 19575 days.
Case 4: the next triple peak occurs in 16994 days.
Case 5: the next triple peak occurs in 8910 days.
Case 6: the next triple peak occurs in 10789 days.

*/

}
