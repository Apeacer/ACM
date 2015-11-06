package com.didi.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		
		while(input.hasNext())
		{
			String str=input.next();
			List<String> result= new ArrayList<String>();
			int left=0,right=0;
			
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)>47 && str.charAt(i)<58)
				{
					right = i+1;
					if(i==str.length()-1)
						result.add(str.substring(left,right));
				}
				else 
				{
					if(right-left>0)
						result.add(str.substring(left,right));
					left=i+1;right=i+1;
						
				}
//				System.out.println(left+" "+right);
				
			}
			List<String> result2 = new ArrayList<String>();
			int length =0;
			for(String string :result)
			{
				if(string.length()==length)
					result2.add(string);
				if(string.length()>length)
				{
					length=string.length();
					result2.clear();
					result2.add(string);
				}
			}
			
			if(result2.size()==1)
				System.out.println(result2.get(0));
			else 
			{
				int count=0,nume=0;
				for(int j=0;j<result2.size();j++)
				{
					String s=result2.get(j);
					int temp=0;
					for(int i=0;i<s.length();i++)
						temp+=(((int)s.charAt(i))-48);
//				System.out.println(temp);
//				System.out.println(s);
					if(temp>nume)
					{
						nume=temp;
						count=j;
					}
				}
				
				System.out.println(result2.get(count));
				
			}
		}
		

	}

}
//  abcd12345ed125ss123456789