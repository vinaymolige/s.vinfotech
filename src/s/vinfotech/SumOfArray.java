import java.util.Scanner;
public class SumOfArray {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of elements:");
	int len = sc.nextInt();
	int val[] = new int[len];
	System.out.println("Enter the values:");
	for(int i=0;i<val.length;i++) {
		val[i] = sc.nextInt();
	}
	int sum = 0;
	for(int i=0;i<val.length;i++) {
		sum = sum + val[i];
	}
	System.out.println("Total: "+sum);
}
}
