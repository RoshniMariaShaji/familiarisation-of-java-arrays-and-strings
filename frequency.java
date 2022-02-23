import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,x=0;
		System.out.println("Enter the string");
        String str=sc.nextLine();
		System.out.println("Enter the character whose frequency is to be claculated");
		char ch=sc.next().charAt(0);
		for(i=0;i<str.length();i++)
			if(str.charAt(i)==ch)
				x++;
		System.out.println("Frequency of "+ch+" in the string is "+x);
	}
}
