package com.leetcode_ex1;

/*	Write a function that takes an unsigned integer and returns the number of ’1' 
 * bits it has (also known as the Hamming weight).
	For example, the 32-bit integer ’11' has binary representation 
	00000000000000000000000000001011, so the function should return 3
*/
public class Main
{
	public static void main (String[]args)
	{
		Solution solution=new Solution();
		int i=32;//2147483648;
		System.out.println(solution.hammingWeight(i)+" ");//test
		
		System.out.println("tow de jie guo:"+  solution.hammingWeight2(i)+" ");
	}
}

class Solution 
{
    // you need to treat n as an unsigned value
	public int hammingWeight(int n) 
    {
        if(n==1)
        {
        	return 1;
        }
        if(n==0)
        {
        	return 0;
        }
        else 
        {
        	int result=0;

        	while(n!=0)
        	{
        		int i=0;
        		while((int)Math.pow(2, i)<=n )
        		{
        			i++;
//System.out.println("zzzz"+i);
        		}
        		
//System.out.print("减一个："+(int)Math.pow(2, i-1)+" ");
        		n=n-(int)Math.pow(2, i-1);
//System.out.println("得：" + n);
        		result++;
        	}
        	
        	return result;
		}
    }
	
	
	public int hammingWeight2(int n) 
    {
		int result=0;
		
		while(n!=0)
		{
//System.out.println("hhhhh"+ n);
			if(n%2==1)
			{
				result++;
				
			}
			
			n/=2;
		}
		
		return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
