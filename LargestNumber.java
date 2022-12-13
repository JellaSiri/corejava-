import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// int x1=246;
		//int x2 = 4;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a num ");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		for(int i=x1-1 ; i > 0 ; i--)
		{
			boolean f= true;
			int num=i;
			while(num>0)
			{
				int d =num%10;
				if(d==x2)
				{
				   f =false;
			  	   break;
			    }
				num=num/10;
		    }
		   if(f==true)
			{
				System.out.println("largest num is : "+i);
				break;
			}
		}
	}

}
