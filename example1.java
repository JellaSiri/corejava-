import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		
		//String s="abcdABCDabcd"; //o/p:- {a:2 ,A=1,b=2,B=1,c=2,C=1,d=2,D=1}
		
		Map<Character,Integer> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ele");
		String s=sc.next();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch =s.charAt(i);
			if(m.containsKey(ch))
			{
				m.put(ch,m.get(ch)+1); //getting values from the map
			}
			else
			{
				m.put(ch,1);   //add values to the map
			
		   }
	   }
		System.out.println(m);
	}
}
