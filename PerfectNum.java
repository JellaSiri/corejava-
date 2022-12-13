import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		
//perfect number or not 
  Scanner sc =new Scanner(System.in);
     System.out.println("enter a number ");
     int n =sc.nextInt();
     
       int sum=0;
       for(int i=1;i<=n-1;i++)
       {
    	   if(n%i==0)
    	   {
    		   sum=sum+i;
    	   }
       }
       if(sum==n)
       { System.out.println("perfect");
	   }
       else
       {
    	   System.out.println("not perfect number");
       }
    }
}
		
		 
	