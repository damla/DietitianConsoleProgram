
public class Test extends Patient {

	public static void main(String[]args) {
		Patient a=new Patient("a","b",49,1.61);
			
		a.setBirthdate("10/10/1900");
		System.out.println(a.getBirthdate());
		System.out.println(a.getAge());
	}
}
