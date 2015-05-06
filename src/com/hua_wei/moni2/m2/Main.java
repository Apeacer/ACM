package com.hua_wei.moni2.m2;

//
//给出一个整数（负数使用其绝对值），输出这个整数中的两种递减数（1.最大递减数；2.递减数中各位数之和最大的数）之和。
//
//递减数：一个数字的递减数是指相邻的数位从大到小排列的数字，不包含相邻的数位大小相同的情况。
//
//最大递减数：所输入整数的所有递减数中值最大的一个。 如： 75345323，递减数有：75,753,53,53,532,32。那么最大的递减数为753。
//
//各位数字之和最大的递减数: 如75345323中的各递减数：75各位数之和=12(7+5=12),753各位数之和=15(7+5+3=15),53各位数之和=8(5+3=8),532各位数之和=10(5+3+2=10),32各位数之和=5(3+2=5)。那么各位数字之和最大的递减数为753。
//
//输出结果=最大递减数+各位数之和最大的递减数。(1506=753+753)


import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    
    public static void main(String [] args)
    {
    	Scanner scanner=new Scanner(System.in);
    	
    	int num=Math.abs(scanner.nextInt());//输入数字

    	String numString=num+"";
  	
    	char nums[]=numString.toCharArray();
    	
    	ArrayList<Integer> result =new ArrayList<Integer>();
    	
    	int low=0,height=0;
    	
    	for(int i=0; i<nums.length-1;i++)
    	{  		
    		height=i+1;
    		if(nums[i]>nums[i+1])//前一个数大于后一个数
    		{
    			int res=0;
    			int start=low;
    			for(int j=height;j>=low;j--)
    			{
    				res+=((int)nums[start]-48)*(int)Math.pow(10, j-low);
//System.out.println("z"+j+" "+low+" "+height+" "+res);
    				start++;
    			}
    			result.add(res);
    		}
    		else 
    		{
				low=i+1;
			}
    		
    	}
//for(int numtemp:result)
//{
//   System.out.print(numtemp+" ");
//}System.out.println();
    	
    	int max_one=0;//最大递减数
    	int max_two=0;//最大个位数和递减数
    	int max_two_add=0;//最大个位数和
    	
    	if(result.isEmpty())
    	{
    		System.out.println("0");
    	}
    	else 
    	{
			
    		for(int a: result)
    		{ 
    			//找最大递减数-------------------
    			if(a>max_one)
    			{
    				max_one=a;
    			}
    			
    			//找各位数之和最大递减数------------
    			int temp=a;//当前数
    			int a_add=0;//当前数各位和
    			while(true)//求各位数之和
    			{
    				a_add+=temp%10;
    				temp/=10;
    				if(temp==0)
    					break;
    			}
//System.out.print("add："+a_add+" " );
    			if(a_add>max_two_add)//当前的大
    			{
    				max_two_add=a_add;
    				max_two=a;
    			}
    			
    		}
//System.out.println();    		
//System.out.println(max_one+" "+max_two);

System.out.println(max_one+max_two);
		}
    }
}
