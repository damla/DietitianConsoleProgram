
public class Test extends Patient {

	public static void main(String[]args) {
		Patient a=new Patient("a","b",49,1.61);
			
		System.out.println(a.getUsername());

		a.setpId();
		System.out.println(a.getpId());

		System.out.println(a.getBmi());

		DietList d=new DietList();
		System.out.println(d.getpId());
		a.setBirthdate("10/10/1996");
		a.setAge();
		System.out.println(a.getAge());
	}
}
