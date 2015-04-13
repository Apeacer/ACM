package com.hua_wei.lianxi1;

import java.util.Scanner;

public class Main2
{
/* 约瑟夫环是一个数学的应用问题：已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。从编号为k的人开始报数，
 * 数到m的那个人出列；他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，直到圆桌周围的人全部出列。
*/
	
	public static void main (String [] arts)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("请输入人数：");
		
		int person=scanner.nextInt();
		
		System.out.println("请输入开始编号：");
		
		int start=scanner.nextInt();
		
		System.out.println("请输入out号：");
		
		int out=scanner.nextInt();
		
		doWhile dowhile=new doWhile(person ,start ,out);
		dowhile.start();
		
	}
	

	
}

class doWhile extends Thread
{
	private final int NULL_POSITION=1;
	
	int person;
	int start;
	int out;
	
	public doWhile(int person ,int start ,int out)
	{
		this.person=person;
		this.start=start;
		this.out=out;
	}
	
	public void run()
	{
		int list[]=new int[person+1];
		
		int position=start;
		int pc=0;
		
		for (int i=start;i<=list.length;i++)
		{
			if((pc/out)==person)//全退出了
			{
				System.out.println("END");
				break;
			}
			if(i==list.length)//到队尾了从头来
			{
				i=1;
			}
			if(list[i]==NULL_POSITION)//已退了，跳过
			{
			}
			if(list[i]!=NULL_POSITION)//没退呢，判断
			{
				pc++;
				
				if(pc%out==0)//中枪处理
				{
					list[i]=NULL_POSITION;
					
					System.out.print("第 "+i+" 号退出，还剩：\t");
					for(int j=1; j<list.length;j++)
					{
						
						if(list[j]!=NULL_POSITION)
							System.out.print(j+" ");
					}
					System.out.println();
					
				}
				else//没中跳过
				{
					
				}
			}
//			if(i==list.length)
//			{
//				i=1;
//			}
//			if(pc==out && list[position]==NULL_POSITION)
//			{
//				position++;
//				continue;
//			}
//			if(pc==out && list[position]!=NULL_POSITION)
//			{
//				list[position]=NULL_POSITION;
//				System.out.print("第 "+start+" 号退出，还剩： ");
//				for(int i=0; i<list.length;i++)
//				{
//					
//					if(list[i]!=NULL_POSITION)
//						System.out.print((i+1)+" ");
//				}
//				System.out.println();
//				position++;
//			}
//			position++;
//			pc++;
			
			

			
		}
		
	}
}
