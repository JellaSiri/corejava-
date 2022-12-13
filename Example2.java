import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		//given two strings a and b.  
// if the String b can be obtained by rotating another string a by exactly 2 places
		//input :- a="shirisha"  ,  b="irishash"     //  1.hirishas  2.irishash
		
		//clock wise means taking from last 
		//anti clock wise direction method taking from first
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a element ");
			String a =sc.next();   //String a="shirisha";
			String b=sc.next();    // String b="irishash";
			String c="";
			String ac ="";
	
		int len=a.length();
		
		c=a.substring(len-2,len)+a.substring(0,len-2);
		          // last two char  // first and last char
		ac=a.substring(2,len)+a.substring(0,2);
		System.out.println(a);
		System.out.println(b);
		
			if(b.equals(c)||b.equals(ac))
			{
		     System.out.println("string is obtained");
			}
			else
			{
		System.out.println("string is not obtained");
		}
	}

}
