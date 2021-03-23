import java.util.Scanner;
class CBLogic{
	String players[] = new String[10];
	int score[] = new int[10];
	void input() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=players.length;i++) {
		System.out.println("Enter Player Name:");
		this.players[i] = sc.nextLine();
		overs:
		for(int a=0;a<=5;a++) {
		balls:
		for(int b=1;b<=6;b++) {
		System.out.println(a+"."+b+" Enter Result:");
		int score = sc.nextInt();
		
		}
		}
		}
		}
		}
	

public class CricBuzz {
public static void main(String args[]) {
	CBLogic cb = new CBLogic();
	cb.input();
}
}
