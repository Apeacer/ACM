package com.ali.a2;

public class Main 
{
	public static void main(String[]arg)
	{
		AppleBox box=new AppleBox();
		
		producer p1 = new producer(box);
		consumer p2 = new consumer(box);
		
		p1.start();
		p2.start();
	}
	
}
class AppleBox//箱子类----------------------------------------------------------
{
	int count;
	
	public AppleBox()
	{}
	
	public synchronized void addOne() //生产方法 
	{
		++count;
		System.out.println("生产者加了一个，现在有苹果："+count);
	}
	public synchronized void takeOne() //消费方法
	{
		--count;
		System.out.println("消费者吃了一个，现在有苹果："+count);
	}
	
	public synchronized int getCount() //当前数量
	{
		return count;
	}
	
}

class producer extends Thread  //生产者进程-------------------------------------
{
	AppleBox box;
	
	public producer(AppleBox box)
	{
		this.box=box;
	}
	
	public void run()
	{
		while (true) 
		{
			try 
			{
				if (box.getCount()<5 )
				{
					box.addOne();

				}
				else
				{
					System.out.println("箱子满了，生产者等待");
				}
				sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
	}

}


class consumer extends Thread //消费者进程--------------------------------------
{
	AppleBox box;
	
	public consumer(AppleBox box)
	{
		this.box=box;
	}
	
	public void run()
	{
		while (true) 
		{
			try 
			{
				if (box.getCount()>0)
				{
					box.takeOne();
				}
				else
				{
					System.out.println("没苹果，消费者等待");
				}
				sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
	}

}