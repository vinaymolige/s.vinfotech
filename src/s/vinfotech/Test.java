class TestOne {
	void add(int a, int b) {
		System.out.println(a+b);
	}
}
class TestTwo extends TestOne {
	void add(int a, int b) {
		System.out.println(a-b);
	}
}
public class Test {
public static void main(String args[]) {
	TestOne tt = new TestTwo();
	tt.add(10, 16);
}
}
