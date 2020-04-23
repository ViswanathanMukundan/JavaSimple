import java.util.Arrays;
import java.util.Scanner;
class anagram
{
	static void check(String s1, String s2)
	{
		boolean flag = true;
		if(s1.length() == s2.length())
		{
			char[] a = s1.toLowerCase().toCharArray();
			char[] b = s2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			flag = Arrays.equals(a,b);
		}
		else
			flag = false; 
		if(flag)
			System.out.println("Anagrams");
		else	
			System.out.println("Not anagrams");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = sc.nextLine();
		check(s1,s2);
	}
}