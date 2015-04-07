package com.hua_wei.moni1;

/*Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，
123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12A
BBA,ABA->ABAKK,123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可
看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找
出最长的有效密码串吗？
*/

import java.util.Scanner;
public class Main 
{
	public static void main(String []arg)
	{
		//录入
		Scanner input = new Scanner(System.in);
		
		String passwordString=input.nextLine();//密码
		int length=passwordString.length();//长度
		
		char list[]=passwordString.toCharArray();

//for(char a: list)
//{
//	System.out.print(a+" ");
//}

		int result =0;

		for(int i=0; i<length;i++)
		{
			//对称为奇数
			for(int j=0; i-j>=0 && i+j<length ; j++)
			{
				if(list[i-j]!=list[i+j])
					break;
				if(list[i-j]==list[i+j])
				{
					if ((2*j+1)>result)
						result=(2*j+1);
				}
			}
					
			//对称为偶数
			for(int j=0; i-j>=0 && i+j+1<length ; j++)
			{
				if(list[i-j]!=list[i+j+1])
					break;
				if(list[i-j]==list[i+j+1])
				{
					if ((2*(j+1))>result)
						result=2*(j+1);
				}
			}
		}
		
		System.out.println(result);

	}
}








//public class Main 
//{
//	public static void main(String []arg)
//	{
//		//录入
//		Scanner input = new Scanner(System.in);
//		
//		String passwordString=input.nextLine();//密码
//		int length=passwordString.length();//长度
//		
//		ArrayList<String> list=new ArrayList<String>();//容器
//
//		for (int i=0 ; i< length; i++)//分别存入容器
//		{
//			String temp="";
//			temp=passwordString.substring(i,i+1);
//			list.add(temp);
//		}
//System.out.println(list.toString());
//		
//		int low=0,high=length-1;//左右游标
//		while (low<length) 
//		{
//			if(low<high && !list.get(low).equals(list.get(high)))//两边不等的情怀、情况
//			{
//				if(low<high && list.get(low).equals(list.get(high-1)))//删右面
//				{
//					list.remove(high);
//					high--;
//				}
//				if(low<high && list.get(low+1).equals(list.get(high)))//删左面
//				{
//					list.remove(low);
//					high--;
//					low--;
//				}
//				if(low<high && list.get(low+1).equals(list.get(high-1)))//删两面
//				{
//					list.remove(low);
//					list.remove(high);
//					high--;
//					low--;
//				}
//				
//				
//			}
//			
//		}
//		System.out.println("end");
//System.out.println(list.toString());
//		
//	}
//	
//}