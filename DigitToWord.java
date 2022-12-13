import java.util.Scanner;

public class DigitToWord {

	public static void main(String[] args) {
		
       //convert  numbers to digit
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number ");	
		String n=sc.next();
		String s="";
		String []arr= {"zero","one","two","three","four","five","six","seven","eigtht","nine"};
		for( int i=0;i<=n.length()-1;i++)
		{
			char ch =n.charAt(i);
			if(ch >=48&& ch<=57)  //0 ->48   9->57
			{
				int d=ch-48;
			   s=s+" "+arr[d];
		    }
		}
		System.out.println(s);	
		
		// con
		/*int n1=1234;
		String word ="";
		while(n1>0)
		{
			int temp=n1%10;
			switch(temp)
			{
			case 0: word="zero"+ " "+word;
			break;
			case 1: word="one"+ " "+word;
			break;
			case 2: word="two"+ " "+word;
			break;
			case 3: word="three"+ " "+word;
			break;
			case 4: word="four"+ " "+word;
			break;
			case 5: word="five"+ " "+word;
			break;
			case 6: word="six"+ " "+word;
			break;
			case 7: word="seven"+ " "+word;
			break;
			case 8: word="eigth"+ " "+word;
			break;
			case 9: word="nine"+ " "+word;
			break;
			}
			n1=n1/10;
		}
		System.out.println(word);
		*/
	}
	
}
