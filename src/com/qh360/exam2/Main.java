package com.qh360.exam2;

import java.util.Scanner;

public class Main 
{
//	static int result = 0;
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		int M=input.nextInt();
		do
		{
			int [][] relation = new int[N+1][N+1];
			for(int i=0;i<M;i++)
			{
				int x=input.nextInt();
				int y=input.nextInt();
				relation[x][y]=1;
				relation[y][x]=1;
			}
			
			int [] flag = new int [N+1];
			dofind(1,relation,flag);
			int result=0;
			for(int b : flag)
				if(b==1)
					result++;
			System.out.println(result);
			
			N=input.nextInt();
			M=input.nextInt();
			
		}while(!(N==0 && M==0));
		
	}
	static void dofind(int p,int [][]relation,int[]flag)
	{
		for(int i=p;i<flag.length;i++)
		{
			if(relation[p][i]==1 )
			{
				flag[i]=1;
				dofind( i, relation, flag);
			}
		}
	}
}


//			result=0;

//			for(int v:flag)
//				System.out.print(v+" ");
//			System.out.println();System.out.println();
//			
//			for(int[]a:relation)/////////////////////////
//				{for(int b:a)
//					{System.out.print(b+" ");}System.out.println();}