
public class Test{
// for dongusuyle giris yaptiririz. treeye eklemek icin id kullanacagimizi ele alirsak kullanicilara atanan en son id numarasini kayit ettirerek ordan eklemeye devam etmesini saglaya_
// biliriz.
	public static void main(String[]args) {
		//1st patient
		Patient d=new Patient("Damla","Koksal",51,1.61);
		
		d.setBirthdate("10/10/1996"); 
		d.setBmi();
		d.setUsername();
		System.out.println("Username: "+ d.getUsername() +
						   "\nName: "+ d.getpName() +
						   "\nSurname: "+ d.getpSurname() +
						   "\nBirthdate: " + d.getBirthdate() +
						   "\nAge: " + d.getAge() +
						   "\nWeight: " + d.getWeight() +
						   "\nHeight: " + d.getHeight() +
						   "\nBmi: " + d.getBmi() +
						   "\nId: " + d.getpId());
		
		Patient o=new Patient("Yaprak", "Koksal", 54, 1.62);
		//2nd patient
		
		o.setBirthdate("10/10/2001");
		o.setBmi();
		o.setUsername();
		System.out.println("Username: "+ o.getUsername() +
				   "\nName: "+ o.getpName() +
				   "\nSurname: "+ o.getpSurname() +
				   "\nBirthdate: " + o.getBirthdate() +
				   "\nAge: " + o.getAge() +
				   "\nWeight: " + o.getWeight() +
				   "\nHeight: " + o.getHeight() +
				   "\nBmi: " + o.getBmi() +
				   "\nId: " + o.getpId()); 
		//id obje mi olmali?
		//patient object test ended here.
		System.out.println("------------------------- ");
		DietList a=new DietList();
		a.setdList("");
		a.setBmi();
		d.setDietList(a);
		System.out.println(d.getDietList());
		//Diet object test ended here.
	}
}
