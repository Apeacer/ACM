package com.baidu.exam2016.q3;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[]args) throws UnsupportedEncodingException
	{
		Scanner inputScanner = new Scanner(System.in);
		
		String aString = new String(inputScanner.next().getBytes(),"gbk");
		String bString =  new String(inputScanner.next().getBytes(),"gbk");//inputScanner.next();
		boolean result = true;
		for(int i=0; i<bString.length(); i++)
		{
			char a =bString.charAt(i);
			if(aString.length()==0 && i<bString.length())
				result=false;
			for(int j=0; j<aString.length(); j++)
			{
				if(aString.charAt(j)==a)
				{
					aString = aString.substring(0,j)+aString.substring(j+1,aString.length());
					break;
				}
				if(j ==aString.length()-1)
					result=false;
			}
		}
		if(result)
			System.out.println(1);
		else {
			System.out.println(0);
		}
	}
}
