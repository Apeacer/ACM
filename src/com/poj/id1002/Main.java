package com.poj.id1002;

/*
Description

企业喜欢用容易被记住的电话号码。让电话号码容易被记住的一个办法是将它写成一个容易记住的单词或者短语。例如，你需要给滑铁卢大学打电话时，可以拨打TUT-GLOP。有时，只将电话号码中部分数字拼写成单词。当你晚上回到酒店，可以通过拨打310-GINO来向Gino's订一份pizza。让电话号码容易被记住的另一个办法是以一种好记的方式对号码的数字进行分组。通过拨打必胜客的“三个十”号码3-10-10-10，你可以从他们那里订pizza。 

电话号码的标准格式是七位十进制数，并在第三、第四位数字之间有一个连接符。电话拨号盘提供了从字母到数字的映射，映射关系如下： 
A, B, 和C 映射到 2 
D, E, 和F 映射到 3 
G, H, 和I 映射到 4 
J, K, 和L 映射到 5 
M, N, 和O 映射到 6 
P, R, 和S 映射到 7 
T, U, 和V 映射到 8 
W, X, 和Y 映射到 9 

Q和Z没有映射到任何数字，连字符不需要拨号，可以任意添加和删除。 TUT-GLOP的标准格式是888-4567，310-GINO的标准格式是310-4466，3-10-10-10的标准格式是310-1010。 

如果两个号码有相同的标准格式，那么他们就是等同的（相同的拨号） 

你的公司正在为本地的公司编写一个电话号码薄。作为质量控制的一部分，你想要检查是否有两个和多个公司拥有相同的电话号码。 
Input

输入的格式是，第一行是一个正整数，指定电话号码薄中号码的数量（最多100000）。余下的每行是一个电话号码。每个电话号码由数字，大写字母（除了Q和Z）以及连接符组成。每个电话号码中只会刚好有7个数字或者字母。
Output

对于每个出现重复的号码产生一行输出，输出是号码的标准格式紧跟一个空格然后是它的重复次数。如果存在多个重复的号码，则按照号码的字典升序输出。如果输入数据中没有重复的号码，输出一行： 
No duplicates. 
Sample Input

12
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279
Sample Output

310-1010 2
487-3279 4
888-4567 3
 
 * */




import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main
{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n=scanner.nextInt();//n组数据
		Map<String, Integer> numbers=new HashMap<String, Integer>();
		
		while(n-->0)//处理n组数据
		{
			String goodNumber=scanner.next();//得到输入
			String oldNumber=clearNumber(goodNumber);//净化好记的号码变成标准的号码
			
			//计数
			if(numbers.containsKey(oldNumber))//有了就加1
			{
				numbers.put(oldNumber, numbers.get(oldNumber)+1);
			}
			else //没有就加入
			{
				numbers.put(oldNumber, 1);
			}	
		}
		//显示出
		boolean flag = false;//是否有重复标记  
	
		Object[] keys=numbers.keySet().toArray();
		Arrays.sort(keys);//排序key值
		
		//遍历并显示重复的
		for(int i=0;i<keys.length;i++)
		{
			if(numbers.get(keys[i])>1)
			{
				flag=true;//有重复
				//打印
				System.out.println(keys[i].toString()+" "+numbers.get(keys[i]));
			}
		}  
		//无重复现象
		if (!flag)
		{  
			System.out.println("No duplicates. ");  
		}  

	}
	//处理好记的号码-------------------------------------------------------------------------
	static String clearNumber(String goodNumber)
	{
		StringBuilder oldNumberBuild = new StringBuilder();//之前号码的容器
		String oldNumber="";//之前号码
		
		goodNumber=goodNumber.replace("-", "");//去掉“-”
		
		for(int i=0;i<goodNumber.length();i++)//遍历去掉字母
		{
			oldNumberBuild.append(replace(goodNumber.charAt(i)));//替换字母
		}
		
		oldNumber=oldNumberBuild.toString().substring(0,3)+"-"+oldNumberBuild.toString().substring(3);//最后加上“-”
		return oldNumber;
	}
	
	
	//替换字母的方法-------------------------------------------------------------------------
	static char replace(char ch)
	{
		if(ch=='A' || ch=='B' || ch=='C')
		{
			return '2';
		}
		if(ch=='D' || ch=='E' || ch=='F')
		{
			return '3';
		}
		if(ch=='G' || ch=='H' || ch=='I')
		{
			return '4';
		}
		if(ch=='J' || ch=='K' || ch=='L')
		{
			return '5';
		}
		if(ch=='M' || ch=='N' || ch=='O')
		{
			return '6';
		}
		if(ch=='P' || ch=='R' || ch=='S')
		{
			return '7';
		}
		if(ch=='T' || ch=='U' || ch=='V')
		{
			return '8';
		}
		if(ch=='W' || ch=='X' || ch=='Y')
		{
			return '9';
		}
		return ch;//无匹配是数字
	}
}



////TimeLimiteOut String 是不可变对象，少用String类的方法
//public class Main 
//{
//
//	static Scanner scanner = new Scanner(System.in);
//	
//	public static void main(String[] args) 
//	{
//		int n=scanner.nextInt();
//		
//		Map<String ,Integer> numbers=new HashMap<String ,Integer>();
//		
//		while(n-->0)
//		{
//			String number=scanner.next();
//			
//			String number_before=doPure(number);
//			
//			if(numbers.containsKey(number_before))
//			{
//				numbers.put(number_before, numbers.get(number_before)+1);
//			}
//			else 
//			{
//				numbers.put(number_before, 1);
//			}
//		}
//		
////		Iterator iterator=numbers.entrySet().iterator();
////		while(iterator.hasNext())
////		{
////			Map.Entry entry = (Map.Entry) iterator.next();
////			Object val = entry.getValue();
////			if(Integer.parseInt(val.toString())<2)
////				numbers.remove(entry.getKey());	
////		}
//		
//		Object[] keys=numbers.keySet().toArray();
//		Arrays.sort(keys);
//		
//		//遍历并显示
//		for(int i=0;i<keys.length;i++)
//		{
////			if(numbers.get(keys[i])>1)
//				System.out.println(keys[i].toString()+" "+numbers.get(keys[i]));
//		}
//		
//		
//	}
//	
//	//净化号码
//	static String doPure(String number)
//	{
//		number=number.replace("-", "");
//	
//		number=Replace(number, "2", "A", "B", "C");
//		number=Replace(number, "3", "D", "E", "F");
//		number=Replace(number, "4", "G", "H", "I");
//		number=Replace(number, "5", "J", "K", "L");
//		number=Replace(number, "6", "M", "N", "O");
//		number=Replace(number, "7", "P", "R", "S");
//		number=Replace(number, "8", "T", "U", "V");
//		number=Replace(number, "9", "W", "X", "Y");
//		
//		number=number.substring(0,3)+"-"+number.substring(3,number.length());
//		
//		return number;
//	}
//	
//	//替换字符
//	static String Replace(String Old,String New,String re1,String re2,String re3)
//	{
//		
//		Old=Old.replace(re1, New);
//		Old=Old.replace(re2, New);
//		Old=Old.replace(re3, New);
//		
//		return Old;
//	}
//
//}






/*
 
 12
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279
 
 */
