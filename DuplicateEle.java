import java.util.Scanner;

public class DuplicateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []arr= {2,3,4,1,2,4,5,6,7,3,1};
		
   for( int i=0;i<=arr.length-1;i++) {
	   for(int j=i+1;j<=arr.length-1;j++)
	   {
		   if(arr[i]==arr[j])
		   {
			   System.out.println("duplicate numbes is :"+arr[j]);
		   }
	   }
   }
	}

}
