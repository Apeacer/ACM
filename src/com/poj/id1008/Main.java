package com.poj.id1008;

/*
 
 上周末，M.A. Ya教授对古老的玛雅有了一个重大发现。从一个古老的节绳（玛雅人用于记事的工具）中，教授发现玛雅人使用了一个一年有365天的叫做Haab的历法。这个Haab历法拥有19个月，在开始的18个月，一个月有20天，月份的名字分别是pop, no, zip, zotz, tzec, xul, yoxkin, mol, chen, yax, zac, ceh, mac, kankin, muan, pax, koyab, cumhu。这些月份中的日期用0到19表示。Haab历的最后一个月叫做uayet，它只有5天，用0到4表示。玛雅人认为这个日期最少的月份是不吉利的，在这个月法庭不开庭，人们不从事交易，甚至没有人打扫屋中的地板。 

因为宗教的原因，玛雅人还使用了另一个历法，在这个历法中年被称为Tzolkin(holly年)，一年被分成13个不同的时期，每个时期有20天，每一天用一个数字和一个单词相组合的形式来表示。使用的数字是1~13，使用的单词共有20个，它们分别是：imix, ik, akbal, kan, chicchan, cimi, manik, lamat, muluk, ok, chuen, eb, ben, ix, mem, cib, caban, eznab, canac, ahau。注意：年中的每一天都有着明确唯一的描述，比如，在一年的开始，日期如下描述： 1 imix, 2 ik, 3 akbal, 4 kan, 5 chicchan, 6 cimi, 7 manik, 8 lamat, 9 muluk, 10 ok, 11 chuen, 12 eb, 13 ben, 1 ix, 2 mem, 3 cib, 4 caban, 5 eznab, 6 canac, 7 ahau, ，8 imix, 9 ik, 10 akbal ……也就是说数字和单词各自独立循环使用。 

Haab历和Tzolkin历中的年都用数字0，1，……表示，数字0表示世界的开始。所以第一天被表示成： 
Haab: 0. pop 0 
Tzolkin: 1 imix 0 
请帮助M.A. Ya教授写一个程序可以把Haab历转化成Tzolkin历。 
Input

Haab历中的数据由如下的方式表示： 
日期. 月份 年数 

输入中的第一行表示要转化的Haab历日期的数据量。下面的每一行表示一个日期，年数小于5000。 
Output

Tzolkin历中的数据由如下的方式表示： 
天数字 天名称 年数 

第一行表示输出的日期数量。下面的每一行表示一个输入数据中对应的Tzolkin历中的日期。


Sample Input
3
10. zac 0
0. pop 0
10. zac 1995


Sample Output
3
3 chuen 0
1 imix 0
9 cimi 2801
 
 */


import java.util.Scanner;

public class Main
{
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int T=scan.nextInt();//数据数量
		final int DAY_PER_MONTH=20;//天数每月
		final int DAY_LAST_MONTH=5;//最后一月的天数
		
		while(T-->0)
		{
System.out.println("haha "+TzolkinIntToString(14));
			int day=(int)scan.nextDouble();
			String month_name=scan.next();
			int year=scan.nextInt();
			int month=HaabMonthToInt(month_name);
			
			int dayPer=DAY_PER_MONTH;//设定月的天数
			
			int days=(year*365)+(month)*dayPer+day+1;
			System.out.println(TzolkinIntToString(days));
			
		}

	}
	
	//根据haab月份得到数字
	static int HaabMonthToInt(String month_name)
	{
		String[] months={"pop", "no", "zip", "zotz", "tzec", "xul", "yoxkin", "mol", "chen", "yax", "zac", "ceh", "mac", "kankin", "muan",  "pax", "koyab", "cumhu", "uayet"};
		
		for(int i=0;i<months.length;i++)
		{
			if(month_name.equals(months[i]))
				return i;
		}
		return -1;
	}
	
	//根据天数获得Tzolkin历
	static String TzolkinIntToString(int days)
	{		
		final int TZOLIKN_PER_YEAR=260;//Tzolkin每年的天数
		
		int year=days/TZOLIKN_PER_YEAR;
		int last_day=days%TZOLIKN_PER_YEAR;
		if(last_day==0)
			year--;
		int first=last_day%13;
		if(first==0)
			first=13;
		int last=last_day%20;
		if(last==0)
			last=20;
		String last_name=TzolkinIntToMonth(last);
		
		return first+" "+last_name+" "+year;
		
	}
	
	//根据天数得到月
	static String TzolkinIntToMonth(int day)
	{
		String [] lasts={"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk", 
				         "ok", "chuen", "eb", "ben", "ix", "mem", "cib", "caban", "eznab", "canac", "ahau"};
		return lasts[day-1];
	}

}
