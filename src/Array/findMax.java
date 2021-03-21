package Array;

public class findMax {
public static void main(String args[]) 
{
int input[]={2,3,5,4,1,3,68,6,43,5,3,2};
int max = input[0];
for( int i = 1;i<=input.length;i++) {
	if (input[i] > max){
		max = input[i];
System.out.println(max);
	}
}
System.out.println(max);
}
}
