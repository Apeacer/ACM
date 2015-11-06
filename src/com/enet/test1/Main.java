package com.enet.test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		String str0=scan.next();
		String str2=scan.next();
		String str1 ="";
		int length = str0.length();
		int compare = 0;
		for(int i=0;i<length;i++)
		{
			char pos = str0.charAt(i);
			if(((int)pos>=48 && (int)pos<=57)||((int)pos>=97 && (int)pos<=122)||((int)pos>=65 && (int)pos<=90))
			{
				str1 = str1+"1";
			}
			else 
			{
				str1 = str1+"0";
			}
		}
		System.out.println(str1);
		for(int j=0;j<length;j++)
		{
			if (str1.charAt(j)==str2.charAt(j))
				compare++;
		} 
		double asd =(double)(compare*100)/(double)length;
		System.out.println(String.format("%.2f", asd)+"%");

	}

}
