import java.util.Scanner;
public class EvenOddArray {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of elements: ");
	int len = sc.nextInt();
	int val[] = new int[len];
	System.out.println("Enter Values:");
	for(int i=0;i<len;i++) {
		val[i] = sc.nextInt();
	}
	System.out.println("Even Numbers Below:");
	for(int i=0;i<len;i++) {
		if(val[i] %2 == 0)
			System.out.println(val[i]);
	}
	System.out.println("Odd Numbers Below:");
	for(int i=0;i<len;i++) {
		if(val[i] %2 !=0)
			System.out.println(val[i]);
	}
	}
}
