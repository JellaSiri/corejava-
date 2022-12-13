import java.util.Scanner;

public class UpperCasetoLowerCase {

	public static void main(String[] args) {
		 //Input :- ApPLe   o/p:-aPplE
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter an element ");
		String s=sc.next();
				
		 //String s="ApPLe";
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 char ch1=s.charAt(i);
			char  ch2=s.charAt(i);
			if(Character.isLowerCase(ch1))
			 System.out.print(Character.toUpperCase(s.charAt(i)));
			 if(Character.isUpperCase(ch2))
				 System.out.print(Character.toLowerCase(ch2));
		 }

	}

}
