import java.util.Scanner;
public class ArrayTwo {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	int rows = sc.nextInt();
	System.out.println("Enter the no. of columns:");
	int cols = sc.nextInt();
	int table[][] = new int [rows][cols];
	System.out.println("Enter Values: ");
	for(int i=0;i<table.length;i++) {
		for(int j=0;j<table.length;j++) {
			table[rows][cols] = sc.nextInt();
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println(table[rows][cols]);
		}
	} 
}
}
