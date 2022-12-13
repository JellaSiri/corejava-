import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charcter");
		String s1=sc.next();          //String s1="Mary";
		String s2=sc.next();         //String s2="aRmy";         
		                     
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char []a1=s1.toCharArray();
		char[]a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1,a2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not");
		}
	}

}
