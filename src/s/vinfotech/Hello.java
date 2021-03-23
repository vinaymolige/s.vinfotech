import java.util.Scanner;
public class Hello {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	for(int over=0;over<=5;over++) {
		for(int ball=1;ball<=0;ball++) {
			System.out.println(over+"."+ball+" Enter Result:");
			int result = sc.nextInt();
		}
	}
}
}
