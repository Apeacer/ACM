package com.hua_wei.moni3;

import java.util.Map;

//在一个社交应用中，两个用户设定朋友关系后，则可以互相收到对方发布或转发的信息。当一个用户发布或转发一条信息时，他的所有朋友都能收到该信息。
//
//现给定一组用户，及用户之间的朋友关系。
//问：当某用户发布一条信息之后，为了让每个人都能在最早时间收到这条信息，这条信息最少需要被转发几次？
// 
//假设：对所有用户而言：
//1）朋友发出信息到自己收到该信息的时延为T（T>0）；
//2）如需转发，从收到信息到转发出信息的时延为0。
// 
//用例保证：在给定的朋友圈关系中，任何人发布的信息总是能通过N（N>=0）次转发让其他所有用户收到。
// 
//例如：
//下图表示某个朋友圈关系（节点间连线表示朋友关系）中，用户1在时刻0发布信息之后，两种不同的转发策略。
//黄色节点表示转发用户，蓝色数字为用户收到信息的时间。

//示例：：
//Sender
//[消息创建者编号]
//Relationship
//[朋友关系列表，1,2 表示1和2是朋友关系]
//End
// 
//如下：
//Sender
//1
//Relationship
//1,2
//1,3
//1,4
//2,5
//2,6
//3,6
//4,6
//4,7
//5,6
//5,8
//5,9
//6,7
//6,8
//6,9
//7,9
//10,7
//End


public class Main 
{
	static int[][]map=new int[10][10];
	
	public static void main(String [] args)
	{
		
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 10; j++) 
			{
//				map[i][j]=0;
				System.out.print(map[j][i]+" ");
			}
			System.out.println();
		}
	}
}


















