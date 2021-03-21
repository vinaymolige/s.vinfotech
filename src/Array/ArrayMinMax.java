package Array;
import java.util.Scanner;
public class ArrayMinMax {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter The No. Of Elements:");
int len = sc.nextInt();
int values[] = new int [len];
int max = values[0];
System.out.println("Enter The Values:");
for(int i=0;i<len;i++) {
values[i] = sc.nextInt();
}
for(int i=0;i<values.length;i++) {
	if(values[i] > max)
		max = values[i];
}
int min = values[0];
for(int i=0;i<values.length;i++) {
if(values[i] < min)
min = values[i];
}

System.out.println("Minimum Value: "+min);
System.out.println("Maximum Value: "+max);
}
}