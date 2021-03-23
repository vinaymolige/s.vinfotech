import java.util.Scanner;
public class CompareStrings {
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter A New Password: ");
	String newPwd = scan.nextLine();
	System.out.println("Confirm The Password: ");
	String comPwd = scan.nextLine();
	if(newPwd.equals(comPwd)) {
		System.out.println("Password Updated Successfully!");
	}
	else {
		System.out.println("Passwords Mismatched!");
	}
}
}
