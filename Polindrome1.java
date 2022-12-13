
public class Polindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Madam Arora teaches malayalam"; //o/p:-madam arora malayalam
		s=s.toLowerCase();
		String []arr=s.split(" ");
     for(int i=0;i<arr.length;i++)
     {
    	String s1=" ";
    	String s2=" ";
	       char[] ch= arr[i].toCharArray();
    	  s1=s1+String.valueOf(ch);
	     for(int j=ch.length-1;j>=0;j--)
	     {
		s2=s2+String.valueOf(ch[j]);
		if(s1.equals(s2))
		{
			System.out.println(s2);
		} 
		
	}
	}
	}
	
}
