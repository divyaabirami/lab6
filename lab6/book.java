package lab6;

import java.util.Scanner;

public class book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  mybook obj[]=new mybook[3];
  int i;
  for(i=0;i<3;i++)
  {
	  obj[i]=new mybook();
	  obj[i].setdetails();
	 
	  
  }
  int sum=0;
  for(int j=0;j<3;j++)
  {
	  sum=(int)(sum+obj[j].cost);
	  
  }
  System.out.println("cost of all 3 books="+sum);
	}

}
abstract class book1
{
	String name;
	String author;
	double cost;
	Scanner obj=new Scanner(System.in);
	abstract void setdetails();
	String getname()
	{
        return name;		
	}
		
	
}
class mybook extends book1
{
	public void setdetails()
	{
		System.out.println("enter name");
		name=obj.next();
		System.out.println("enter author");
		author=obj.next();
		System.out.println("enter cost");
		cost=obj.nextDouble();
	}
}