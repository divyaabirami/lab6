package lab6;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner obj=new Scanner (System.in);
 myqueue aa =new myqueue(5);
 char ch;
 System.out.println("static queue size:10\n");
 do
 {
	 System.out.println("1.enqueue\n2.dequeue\n3display");
	 int op=obj.nextInt();
	 switch(op)
	 {
	 case 1:
		 System.out.println("\n enter element to insert");
	     int a=obj.nextInt();
	     aa.enqueue(a);
	     aa.display();
	     break;
	 case 2:
		 aa.dequeue();
		 aa.display();
		 break;
	 case 3:
		 aa.display();
		 break;
	default:
		System.out.println("enter 1or 2 or 3 ");
		break;
	 }
	 System.out.println("\n to continue (Y/N)");
	 ch=obj.next().charAt(0);
}while(ch=='Y' || ch=='Y');
	}

}
interface queueoprn
{
	void enqueue(int data);
	void dequeue();
	void display();
}

 class myqueue implements queueoprn
{
	int queue[],max;
	int front=-1,rear=-1;
	myqueue(int n)
	{
		max=n;
		queue=new int[max];
	}
	public void enqueue(int data)
	   {
		   if(rear==max-1)
			   System.out.println("\n queue is full ");
		   else
		   {
			   if(front==-1 && rear==-1)
				   front++;
			   rear++;
			   queue[rear]=data;
		   }
	   }   
	   public void dequeue()
	   {
		   if(front==-1 && rear==-1)
			   System.out.println("\n queue is empty ");
		   else
		   {
			   if(front==rear)
			   {
				   System.out.println("\n deleted element is "+queue[front]);
				   front=rear-1;
			   }   
			   else
			   {
				   System.out.println("\n deleted element is "+queue[front]);
				   front++;
			   }	   
		   }
	   }
	   public void display()
	   {
		   if(front==-1 && rear==-1)
			   System.out.println("\n queue is empty ");
		   else
		   {
			   System.out.println("\n elements in the queue: ");
			   for(int i=front;i<=rear;i++)
				   System.out.println(" "+ queue[i]+ " ");
			   
		   }
		   System.out.println("\n.............");
		   
	   }
	   
	   
	}  
		  
	  