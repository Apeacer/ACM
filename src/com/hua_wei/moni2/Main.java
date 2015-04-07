package com.hua_wei.moni2;

import java.util.ArrayList;
import java.util.Scanner;

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
public class Main 
{
    
    public static void main(String [] args)
    {
    	Scanner scanner=new Scanner(System.in);
    	
    	int num=Math.abs(scanner.nextInt());

    	String numString=num+"";
  	
//    	char nums[]=numString.toCharArray();
    	
    	ArrayList<Integer> result =new ArrayList<Integer>();
    	
    	int low=0,height=0;
    	
    	for(int i=0; i<numString.length()-1;i++)
    	{
    		height=i+2;
    		if(Integer.parseInt(numString.substring(i, i+1))>Integer.parseInt(numString.substring(i+1, i+2)))
    		{
    			result.add(Integer.parseInt(numString.substring(low, height)));
    		}
    		else 
    		{
				low=i+1;
			}
    	}
    	
    	int max=0;
    	ArrayList<Integer> resultADD=new ArrayList<Integer>();
    	int maxadd=0;
    	
    	if(result.isEmpty())
    		{
    			System.out.println("0");
    		}
    	else 
    	{
			
//System.out.print("递减集合：");
    		for(int a: result)
    		{ 
//System.out.print(a+" ");
    			if(a>max)
    			{max=a;}
    			
    			
    			String temp=a+"";
    			int add=0;
    			for(int i=0;i<temp.length();i++)
    			{
    				add+=Integer.parseInt(temp.substring(i,i+1));
    			}
    			
    			resultADD.add(add);	
    			
    		}
    		
    		for (int b : resultADD) 
    		{
    			if(b>maxadd)
    			{
    				maxadd=b;
    			}
    		}
    		
//System.out.println();
//System.out.println(max +" "+maxadd);
System.out.println(max+result.get(resultADD.indexOf(maxadd)));
		}
    }
}
