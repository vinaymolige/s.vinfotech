import java.text.DecimalFormat;
import java.util.Scanner;
public class StrikeRate {
public static void main(String args[])
{
	DecimalFormat df = new DecimalFormat("#.##");
	Scanner read = new Scanner(System.in);
	System.out.println("Enter Runs:");
	float runs = read.nextInt();
	System.out.println("Enter Balls:");
	float balls = read.nextFloat();
	float strikeRate = runs/balls*100;
	int ball = (int)balls;
	int run = (int)runs;
	System.out.println("Runs: "+run);
	System.out.println("Balls: "+ball);
	System.out.println("Strike Rate: "+df.format(strikeRate));
}
}
