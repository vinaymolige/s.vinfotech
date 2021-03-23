
public class Strings {
public static void main(String args[])
{
	String s1 = "welcome ";
	String s2 = new String("TO ");
	char arr[] = {'J','a','v','a'};
	String s3 = new String(arr);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(arr);
	System.out.println(s1.length());
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2+s3);
	boolean x = s1.startsWith("W");
	if(x) System.out.println("Yes");
	else System.out.println("No");
	String upp = s1.toUpperCase();
	System.out.println(upp);
	System.out.println(s2.toLowerCase());
	
}
}
