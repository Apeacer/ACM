import java.security.PublicKey;


public class Main {

	static String string1;
	
	public static void main(String[] args)
	{
		//静态String 未初始化为"null"
		System.out.println(string1+="s");
		
		int num1=(int)1.;
		System.out.println(num1);
		
//		int b=5000*365;
//		System.out.println(b);
		
		char one='1';
		char nine='9';
		char zero='0';
		System.out.println((int)one+" "+(int)nine+" "+(int)zero);
		
		char a1='a';
		char a2='z';
		char a3='A';
		char a4='Z';
		System.out.println((int)a1+" "+(int)a2+" "+(int)a3+" "+(int)a4+" ");
		
		int [][]map ={{2,2},{3,3},{4,4}};
		System.out.println(map.length+" "+map[0].length);
		System.out.println("asdfafw".length());
		
		int x=0,y=0;
		map[x][y] =(map[x][y]==1) ? 0 : 1;
		
		
		String string =new String("123");
		String string_1=changeString(string);
		System.out.println("参数传递的是引用的副本，所以string还是："+string);
		
		Node node = new Node();
		changeNode(node);
		System.out.println(node.value);
		
	}
	
	static String changeString (String str)
	{
		str =new String("456");
		return str;
	}
	
	static Node changeNode (Node n)
	{
		Node node = new Node();
		node.value=123;
		n=node;
		return n;
	}

}

class Node
{
	int value=12;
}
