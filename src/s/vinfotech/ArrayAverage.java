import java.util.Scanner;
public class ArrayAverage {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of elements:");
	int len = sc.nextInt();
	int val[] = new int[len];
	System.out.println("Enter the values:");
	for(int i=0;i<len;i++) {
		val[i] = sc.nextInt();
	}
	int sum = 0,avg;
	for(int i=0;i<len;i++) {
		sum = sum + val[i];
	}
	avg = sum/len;
	System.out.println("Total Of Elements: "+sum);
	System.out.println("Average Of Elements: "+avg);
}
}
