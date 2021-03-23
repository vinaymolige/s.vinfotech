class Name {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class SetGetMethods {
	public static void main(String args[])
	{
		Name N = new Name();
		N.setName("Naveen Chinthapatla");
		System.out.println(N.getName());
	}
}
