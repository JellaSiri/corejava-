
public class Polindrome {

	public static void main(String[] args) {
		
		String s="liril";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
				{
			System.out.println("polindrome");
				}
		else {
			System.out.println("not polindrome");
		}
	}

}
